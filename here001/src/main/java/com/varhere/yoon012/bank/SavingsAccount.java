package com.varhere.yoon012.bank;

import java.sql.Date;

//import com.varhere.banking.InsufficientBalanceException;

public class SavingsAccount extends Account {
	private static final double DFFAULT_INTEREST_RATE = 0.03;
	private double interestRate; // 이자율 
	
//	public SavingsAccount() {
//		
//	}
	
	public SavingsAccount(String accountNum, double balance) {
		this(accountNum, balance,DFFAULT_INTEREST_RATE);
	}
	
	public SavingsAccount(String accountNum, double balance, double overfraftAmount) {
		super();
		this.interestRate = interestRate;
	}
	
	public SavingsAccount() {
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) {
		if(balance - amount < 0) {
			throw new InsufficientBalanceException("잔고가 부족합니다.");
		}
		super.balance -= amount;
	}
	
//	public static void main(String[] args) {
//		try {
//			System.out.println(interestRate);
//		}catch(InsufficientBalanceException i) {
//			System.err.println(i.getMessage());
//		}
//	}

	public double getInterestRate() {
		return 0;
	}

	public void setInterestRate(double d) {
		// TODO Auto-generated method stub
		
	}

	public void setRegDate(Date date) {
		// TODO Auto-generated method stub
		
	}
}