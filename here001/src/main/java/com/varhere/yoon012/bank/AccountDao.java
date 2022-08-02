package com.varhere.yoon012.bank;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class AccountDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_ID = "jv250";
	private static final String JDBC_PASSWD = "jv250";
	
	public AccountDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER --->" + JDBC_DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public void addAccount (Account account) {
		String sql = "INSERT INTO Account(accountNum, balance, interestRate, "
				+ "overdraft, accountType, customerId"
				+ "VALUES (?, ?, ?, ?, ?, ?)";
//		SavingsAccount sc = null;
//		CheckingAccount cc = null;
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_ID,  JDBC_PASSWD);
				pstmt = (PreparedStatement) con.prepareStatement(sql);
				pstmt.setString(1, account.getAccountNum());
				pstmt.setDouble(2, account.getBalance());
				if(account instanceof SavingsAccount) {
					SavingsAccount sa = (SavingsAccount)account;
					pstmt.setDouble(3, sa.getInterestRate());
					pstmt.setDouble(4, 0.0);
					pstmt.setString(5, String.valueOf('S'));
				}else {
					CheckingAccount ca = (CheckingAccount)account;
					pstmt.setDouble(3, 0.0);
					pstmt.setDouble(4, ca.getOverdraftAmount());
					pstmt.setString(5, String.valueOf('C'));
				}
			}finally {
				pstmt.close();
				con.close();
			}
			System.out.println("NEW ACCOUNT INSERTED...\n");
		} catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public List<Account> findAccountsBySsn(String ssn) {
		String sql = "SELECT a.aid, a.accountNu, a.balance, a.interestRate, a.overdraft, a.accountType,"
				+ "c.name, c.ssn, c.phone, a.regDate"
				+ " FROM Account a INNER JOIN Customer c ON a.customerId = c.cid"
				+ " WHERE c.ssn = ?";
		List<Account> list = new ArrayList<>();
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_ID,  JDBC_PASSWD);
				pstmt = (PreparedStatement) con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				Account account = null;
				while(rs.next()) {
					if(rs.getString("AccountType").charAt(0) == 'S') {
						account = new SavingsAccount(sql,0);
						((SavingsAccount)account).setInterestRate(
								rs.getDouble("interestRate"));
					}else {
						account = new CheckingAccount();
						((CheckingAccount)account).setOverdraftAmount(
								rs.getDouble("overdraftAmount"));
					}
					account.setAid(rs.getLong("aid"));
					account.setAccountNum(rs.getString("accountNum"));
					account.setBalance(rs.getDouble("balance"));
					account.setCustomer(new Customer(rs.getString("name"),
							rs.getString("ssn"), rs.getString("phone")));
					account.setRegdate(rs.getTimestamp("regDate"));
					account.setAccountType(rs.getString("accountType").charAt(0));
					list.add(account);
				}
			} finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	public List<Account> findAccounts() {
		return null;
	}
	
}
