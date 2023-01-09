package com.bank.sprint1.service;

import java.util.List;

import com.bank.sprint1.entity.Customer;

public interface CustomerService {

	// method for saving Customer details
	Customer saveCustomer(Customer customer);

	// method for saving Customer details based on customerId
	Customer getCustomerById(long customerId);

	// method for fetching all Customer details
	List<Customer> getAllCustomers();

	// method for updating Customer details based on customerId
	Customer updateCustomerById(Customer customer, long customerId);

	// method for removing Customer detail based on customerId
	void deleteCustomerById(long customerId);

	// method to fetch passenger detail based on phone number
	Customer getCustomerByPhone(long customerPhone);
}
