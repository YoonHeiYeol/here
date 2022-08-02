package com.varhere.banking;

public class CheckingAccount extends Account{
	private double overdraftAmount;
	
	public void withdraw(double amount) {
		if(balance < amount) {
			// 잔고부족시 overdraftAmount 금액 한다 내에서 추가 출금을 승인하는 코드 
			// 예외를 발생시킨다.
		}else {
			balance = balance - amount;
		}
	}
}
