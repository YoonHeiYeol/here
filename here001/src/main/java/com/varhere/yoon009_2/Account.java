package com.varhere.yoon009_2;

import java.util.*;

/**
 * 2*5*7 jump lucky 윤희열 
 * Account는 SavingsAccount와 CheckingAccount의 공통적인 부분을 
 * 묶어내기 위해서 만들었다.
 * @author here
 *
 */

public class Account {
	private static Account[] set;
	protected String accountNum;
	protected double balance;
	protected String name;
	protected int ssn;
	protected int phone;
	protected String customerId;
	protected String passWd;
	
	public void deposite(double amount) {
		this.balance += amount;
	}
	
	public void customer () {
	}
	
	public void addCustomer(String name, String ssn, String phone, String customerId, String passWd) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("이름", "name");
		map.put("주민번호", "ssn");
		map.put("연락처", "phone");
		map.put("고객id", "customerId");
		map.put("비밀번호", "passWd");
		
		Set<String> set = map.keySet(); 
		for(String String : set) {
			System.out.println(String);
			System.out.println(" = " + map.get(String));
		}
	}
}

