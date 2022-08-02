package com.varhere.yoon010_1;

import java.util.ArrayList;
import java.util.Collection;

public interface AccountService {
	void addCustomer(Customer customer);
	Customer getCustomerBySsn(String ssn);
	Collection<Customer> getAllCustomers();
	int getNumofCustomers();

}
