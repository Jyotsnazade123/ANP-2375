package com.bank.sprint1.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.bank.sprint1.entity.Customer;
import com.bank.sprint1.service.CustomerService;

@RestController
//rest controller to handle all incoming request using REST API
public class CustomerController {

	@Autowired
	private CustomerService cs;

	// saving customer details using post mapping
	@PostMapping("/saveC")
	public ResponseEntity<Customer> saveC(@Valid @RequestBody Customer customer1) {
		return new ResponseEntity<Customer>(cs.saveCustomer(customer1), HttpStatus.CREATED);

	}

	// fetching customer details by id using get mapping
	@GetMapping("/getC/{customerId}")
	public ResponseEntity<Customer> getC(@PathVariable("customerId") long customerId) {
		return new ResponseEntity<Customer>(cs.getCustomerById(customerId), HttpStatus.OK);
	}

	// updating customer details by id using put mapping
	@PutMapping("/updateC/{customerId}")
	public ResponseEntity<Customer> updateC(@PathVariable("customerId") long customerId,
			@RequestBody Customer customer1) {
		return new ResponseEntity<Customer>(cs.updateCustomerById(customer1, customerId), HttpStatus.OK);
	}

	// deleting customer details by id using post mapping
	@DeleteMapping("deleteC/{customerId}")
	public ResponseEntity<String> deleteC(@PathVariable("customerId") long customerId) {
		cs.deleteCustomerById(customerId);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}

	// fetching customer details using get mapping
	@GetMapping("/gett")
	public List<Customer> getAllC() {
		return cs.getAllCustomers();
	}

}
