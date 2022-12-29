package com.anudip.jpa.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anudip.jpa.entity.Customer;
import com.anudip.jpa.exception.CustomerNotFoundException;
import com.anudip.jpa.repository.CustomerRepository;
import com.anudip.jpa.service.CustomerService;

@Service
//implement all my CRUD method,all business logic
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository crepo;
	
	@Override
	//saving customer details using save() of JpaRepository
	public Customer saveCustomer(Customer cust) {
		return crepo.save(cust);
	}

	@Override
	//fetching customer details from table based on id,if not found then throw exception
	public Customer getByIdCustomer(long cid) {
		return crepo.findById(cid).orElseThrow(()-> new CustomerNotFoundException("Entered Customer id does not exist in system found"));
	}

	@Override
	//fetching all customer details from table using findAll() of JpaRepository
	public List<Customer> getAllCustomers() {
		return crepo.findAll();
	}

	@Override
	//updating customer details based on id from table using save()
	public Customer updateByIdCustomer(Customer cust, long cid) {
		Customer cust1 = crepo.findById(cid).orElseThrow(()-> new CustomerNotFoundException("Entered Customer id does not exist in system found"));
		 
		     //set new values
			 cust1.setCEmail(cust.getCEmail());
			 cust1.setPhone(cust.getPhone());
			 
		
			 // saving details
			 crepo.save(cust1);
			 return cust1;	 
		}

	@Override
	//remove customer details from using deleteById
	public void deleteByIdCustomer(long cid) {
		crepo.findById(cid).orElseThrow(()-> new CustomerNotFoundException("Entered Customer id does not exist in system found"));
		 crepo.deleteById(cid);
		
	}
	
	@Override
	public Customer getCustomerByName(String cName) {
		// TODO Auto-generated method stub
		return crepo.getCustomerByName(cName);
	}

	@Override
	public Customer getCustomerByPhone(long phone) {
		// TODO Auto-generated method stub
		return crepo.getCustomerByPhone(phone);
	}
	

}
