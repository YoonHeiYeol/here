package com.varhere.banking;

public class SavingsAccount extends Account{
	private double interestRate;
	
	public void withdraw(double amount) {
		if(balance - amount < 0) {
			// 예외를 발생시킨다.
			throw new InsufficientBalanceException("잔고부족");
			
		}
		super.balance -= amount;
	}
}
