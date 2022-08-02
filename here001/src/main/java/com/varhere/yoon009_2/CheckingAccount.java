package com.varhere.yoon009_2;

import java.io.IOException;

public class CheckingAccount extends Account {
	private static double overdraftAmount; // 당좌 대월 금액?
	
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
}
