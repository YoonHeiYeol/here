package com.varhere.yoon010;

import java.util.Collection;
import java.util.List;

public interface CustomerService {
	void addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn);
	Collection<Customer> getAllCustomers();
	int getNumofCustomers();
}
