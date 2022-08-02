package com.varhere.yoon012.bank;

public class InsufficientBalanceException extends RuntimeException {
	
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
