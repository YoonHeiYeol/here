package com.varhere.yoon009_2;

import com.varhere.banking.InsufficientBalanceException;

public class SavingsAccount extends Account {
	private static double interestRate; // 이자율 
	
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