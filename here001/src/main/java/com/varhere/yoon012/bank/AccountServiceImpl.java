package com.varhere.yoon012.bank;

import java.util.*;

import com.sun.tools.javac.util.List;

public class AccountServiceImpl implements CustomerService, AccountService {
	private static AccountService service = new AccountServiceImpl();
	private ArrayList<Account> accountList = new ArrayList<Account>();
	private CustomerService customerService;
	
	private AccountServiceImpl() {
		customerService = CustomerServiceImpl.getInstance();
	}
	
	public static AccountService getInstance() {
		return service;
	}
	
	public Account createSavingsAccount(String accountNum, double balace, double interesRate) {
		return new SavingsAccount(accountNum, balace, interesRate);
	}
	
	public Account createSavingAccount(String accountNum, double balace, double overdraftAmount) {
		return new CheckingAccount(accountNum, balace, overdraftAmount);
	}
	
	/**
	 * 신규 계좌 등록 
	 * 
	 * @param account     계좌정보와 고객정보 전체를 캡슐화 한다 
	 */
	public void addAccount(Account account) {
		accountList.add(account);
	}
	
	/**
	 * 전달된 ssn을 통해 고객을 조회한 후 신규 계좌 등록 
	 * @param account
	 * @param ssn
	 */
	public void addAccount(Account account, String ssn) {
		Customer customer = customerService.getCustomerBySsn(ssn);
		account.setCustomer(customer);
	}
	
	public List<Account> getAccountBySsn(String ssn) {
		return null;
	}
	
	public Account getAccountByAccountNum(String accountNum) {
		return null;
	}

	@Override
	public void addCustomer(Customer customer) {
		
	}

	@Override
	public Customer getCustomerBySsn(String ssn) {
		return null;
	}

	@Override
	public Collection<Customer> getAllCustomers() {
		return null;
	}

	@Override
	public int getNumofCustomers() {
		return 0;
	}
}
