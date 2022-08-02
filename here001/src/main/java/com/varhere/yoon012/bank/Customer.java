package com.varhere.yoon012.bank;

import java.util.*;

public class Customer {
	private Long cid;
	private String name;
	private String ssn;
	private String phone;
	private String customerId;
	private String passWd;
	private List<Account> accountList;
	
	public Customer(int i) {
		// TODO Auto-generated constructor stub
	}
	public Customer() {
		// TODO Auto-generated constructor stub
	}
	public Customer(String string, String string2, String string3) {
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getCustomerId() {
		return customerId;
	}
	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	public String getPassWd() {
		return passWd;
	}
	public void setPassWd(String passWd) {
		this.passWd = passWd;
	}
	public List<Account> getAccountList() {
		return accountList;
	}
	public void setAccountList(List<Account> accountList) {
		this.accountList = accountList;
	}
	public Long getCid() {
		return cid;
	}
	public void setCid(Long cid) {
		this.cid = cid;
	}
	public String toString() {
		return "이름: " + name + "주민번호: " + ssn + "전화번호: " + phone + "고객아이디: " + customerId;
	}
	
}
