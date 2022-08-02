package com.varhere.yoon012.bank;

import java.util.*;

public class Account {
//	private static Account[] set;
	protected long aid;
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	protected Date regdate;
	protected char AccountType;
	
//	public Account(String accountNum2, double balance2) {
//		// TODO Auto-generated constructor stub
//	}
//	public static Account[] getSet() {
//		return set;
//	}
//	public static void setSet(Account[] set) {
//		Account.set = set;
//	}
	public String getAccountNum() {
		return accountNum;
	}
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public Date getRegdate() {
		return regdate;
	}
	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}
	public char getAccountType() {
		return AccountType;
	}
	public void setAccountType(char accountType) {
		AccountType = accountType;
	}
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
}

