package com.varhere.yoon013;

import java.io.IOException;

import com.varhere.yoon009_2.NegativePassbookException;

public class CheckingAccount extends Account {
	private static double overdraftAmount;
	
	public CheckingAccount(String accountNum, double balance, double overfraftAmount) {
		super();
		this.overdraftAmount = overdraftAmount;
	}
	
	public CheckingAccount() {
	}

	public void withdraw(double amount) throws IOException {
		if(balance < amount) {
			double overdraftNeeded = amount - balance;
			if(overdraftAmount < overdraftNeeded) {
				throw new NegativePassbookException("마이너스 통장을 사용합니다.");
			}else {
				balance = 0.0;
				overdraftAmount = overdraftAmount - overdraftNeeded;
			}
		}else {
			balance = balance - amount;
		}
	}

	public double getOverdraftAmount() {
		return 0;
	}

	public void setOverdraftAmount(double double1) {
	}
}
