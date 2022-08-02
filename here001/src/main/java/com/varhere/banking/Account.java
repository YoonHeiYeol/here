package com.varhere.banking;
/**
 *account를 생성한 이유는 공통적인거 묶어서 호출하려고이다 
 * @author here
 *
 */
public class Account {
	protected String accountNum;
	protected double balance;
	
	public void deposite(double amount) {
		this.balance += amount;
	}
}
