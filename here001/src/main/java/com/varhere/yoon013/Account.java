package com.varhere.yoon013;

import java.util.*;

public class Account {
	protected long aid;
	protected double balance;
	protected char AccountType;
	public long getAid() {
		return aid;
	}
	public void setAid(long aid) {
		this.aid = aid;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public char getAccountType() {
		return AccountType;
	}
	public void setAccountType(char accountType) {
		AccountType = accountType;
	}
}
