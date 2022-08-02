package com.varhere.yoon010_1;

import java.util.*;

public class Account {
	private static Account[] set;
	protected String accountNum;
	protected double balance;
	protected Customer customer;
	
	public Account(String accountNum2, double balance2) {
		// TODO Auto-generated constructor stub
	}
	public static Account[] getSet() {
		return set;
	}
	public static void setSet(Account[] set) {
		Account.set = set;
	}
	public String getAccountNum() {
		return accountNum;
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

