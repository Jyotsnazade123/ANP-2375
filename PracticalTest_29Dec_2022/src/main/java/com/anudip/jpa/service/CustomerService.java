package com.anudip.jpa.service;

import java.util.List;
import com.anudip.jpa.entity.Customer;


//abstract method for performing CRUD on entity Customer
public interface CustomerService {

	//method for saving customer details
		Customer saveCustomer (Customer cust);
		
	     //method for fetching customer details based on cid
		Customer getByIdCustomer(long cid);
		
		//method for fetching ALL customer details
		List<Customer> getAllCustomers();
		
		//method for update ALL customer details on cid
		Customer updateByIdCustomer(Customer cust,long pid);
		
		//method for delete ALL customer details on cid
		 void deleteByIdCustomer(long cid);
		 
		//method to fetch customer detail based on cname
			Customer getCustomerByName(String cName);
			
			//method to fetch customer detail based on phone 
			Customer getCustomerByPhone(long phone);
		
}
