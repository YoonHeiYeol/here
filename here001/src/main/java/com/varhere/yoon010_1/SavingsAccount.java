package com.varhere.yoon010_1;

import com.varhere.banking.InsufficientBalanceException;

public class SavingsAccount extends Account {
	private static final double DFFAULT_INTEREST_RATE = 0.03;
	private static double interestRate; // 이자율 
	
//	public Saving
	
	public SavingsAccount(String accountNum, double balance, double overfraftAmount) {
		super(accountNum, balance);
		this.interestRate = interestRate;
	}
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			throw new InsufficientBalanceException("잔고가 부족합니다.");
		}
		super.balance -= amount;
	}
	
	public static void main(String[] args) {
		try {
			System.out.println(interestRate);
		}catch(InsufficientBalanceException i) {
			System.err.println(i.getMessage());
		}
	}
}