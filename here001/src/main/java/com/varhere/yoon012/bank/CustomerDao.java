package com.varhere.yoon012.bank;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.mysql.jdbc.PreparedStatement;

public class CustomerDao {
	private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String JDBC_URL = "jdbc:mysql://localhost:3306/jv250?serverTimezone=Asia/Seoul";
	private static final String JDBC_ID = "jv250";
	private static final String JDBC_PASSWD = "jv250";
	
	public CustomerDao() {
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("LOADED DRIVER --->" + JDBC_DRIVER);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public Customer findAllCustomersBySsn(String ssn) {
		String sql = "SELECT * FROM Customer WHERE ssn = ?";
		Customer c = null;
		
		try {
			Connection con = null;
			PreparedStatement pstmt = null;
			ResultSet rs = null;
			try {
				con = DriverManager.getConnection(JDBC_URL, JDBC_ID,  JDBC_PASSWD);
				pstmt = (PreparedStatement) con.prepareStatement(sql);
				pstmt.setString(1, ssn);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					c = new Customer();
					c.setPassWd(rs.getString("passWd"));
					c.setName(rs.getString("name"));
					c.setSsn(rs.getString("ssn"));
					c.setPhone(rs.getString("phone"));
					c.setCustomerId(rs.getString("customerId"));
				}
			} finally {
				rs.close();
				pstmt.close();
				con.close();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return c;
	}
	
	public void addCustomer(Customer customer) {
		String sql = "INSERT INTO Customer(name, ssn, phone, customerId, passWd)"
				+ " VALUES (?, ?, ?, ?, ?)";
		try {
			Connection con = DriverManager.getConnection(JDBC_URL, JDBC_ID,  JDBC_PASSWD);
			PreparedStatement pstmt = (PreparedStatement) con.prepareStatement(sql);
			pstmt.setString(1, customer.getName());
			pstmt.setString(2, customer.getSsn());
			pstmt.setString(3, customer.getPhone());
			pstmt.setString(4, customer.getCustomerId());
			pstmt.setString(5, customer.getPassWd());
			pstmt.executeUpdate();
			pstmt.close();
			System.out.println("INSERTED....");
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public List<Customer> findAllCustomersBySsn() {
		// TODO Auto-generated method stub
		return null;
	}
}
