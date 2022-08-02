package com.varhere.yoon012.bank;

import java.io.IOException;

public class CheckingAccount extends Account {
	private static double overdraftAmount; // 당좌 대월 금액?
	
	public CheckingAccount(String accountNum, double balance, double overfraftAmount) {
		super();
		this.overdraftAmount = overdraftAmount;
	}
	
	public CheckingAccount() {
		// TODO Auto-generated constructor stub
	}

	public void withdraw(double amount) throws IOException {
		if(balance < amount) {
			if(amount <= 0) {
				throw new NegativePassbookException("마이너스 통장을 사용합니다.");
				}
			}else {
				balance = balance - amount;
		}
	}
//	public static void main(String[] args) {
//		try {
//			System.out.println(overdraftAmount);
//		}catch(NegativePassbookException n) {
//			System.err.println(n.getMessage());
//		}
//	}

	public double getOverdraftAmount() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void setOverdraftAmount(double double1) {
		// TODO Auto-generated method stub
		
	}
}
