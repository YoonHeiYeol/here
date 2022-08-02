package com.varhere.yoon012.bank;

import java.sql.Date;

public class AccountDaoTest {
	public static void main(String[] args) {
		AccountDao dao = new AccountDao();
		SavingsAccount sa = new SavingsAccount();
		sa.setAccountNum("567-89-0123");
		sa.setBalance(45000.0);
		sa.setCustomer(new Customer(1004));
		sa.setInterestRate(0.04);
		sa.setRegDate(new Date(0));
		sa.setAccountType('S');
		
		
		dao.addAccount(sa);
		for(Account account : dao.findAccountsBySsn("840824-1234567")) {
			System.out.println(account);
		}
	}
}
