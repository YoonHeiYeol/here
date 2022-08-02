package com.varhere.yoon012.bank;

import java.util.List;

public class CustomerDaoTest {
	public static void main(String[] args) {
		CustomerDao dao = new CustomerDao();
		
		List<Customer> customerList = dao.findAllCustomersBySsn();
		for(Customer customer : customerList) {
			System.out.println(customer);
		}
	}
}
