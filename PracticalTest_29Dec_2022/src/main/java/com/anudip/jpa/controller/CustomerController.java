package com.anudip.jpa.controller;

import java.util.List;

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
import com.anudip.jpa.entity.Customer;

import com.anudip.jpa.service.CustomerService;
import jakarta.validation.Valid;

@RestController
//rest controller to handle all handle all incoming request using REST API
public class CustomerController {

	@Autowired
	private CustomerService cs;

	// save customer details using post mapping
	@PostMapping("/savec")
	public ResponseEntity<Customer> saveC(@Valid @RequestBody Customer customer) {
		return new ResponseEntity<Customer>(cs.saveCustomer(customer), HttpStatus.CREATED);
	}

	// fetching customer details by id using post mapping
	@GetMapping("/getc/{cid}")
	public ResponseEntity<Customer> getP(@PathVariable("cid") long cid) {
		return new ResponseEntity<Customer>(cs.getByIdCustomer(cid), HttpStatus.OK);
	}

	// updating customer details by id using put mapping
	@PutMapping("/updatec/{cid}")
	public ResponseEntity<Customer> updateC(@PathVariable("cid") long cid, @RequestBody Customer customer) {
		return new ResponseEntity<Customer>(cs.updateByIdCustomer(customer, cid), HttpStatus.OK);
	}

	// deleting customer details by id using post mapping
	@DeleteMapping("/deletec/{cid}")
	public ResponseEntity<String> deleteC(@PathVariable("cid") long cid) {
		cs.deleteByIdCustomer(cid);
		return new ResponseEntity<String>("Deleted Successfully", HttpStatus.OK);
	}

	// fetching customer details using get mapping
	@GetMapping("/gett")
	public List<Customer> getAllc() {
		return cs.getAllCustomers();
	}

	// fetching Customer details by name using get mapping
	@GetMapping("/getcbyname/{cname}")
	public ResponseEntity<Customer> getPbyname(@PathVariable("cname") String cname) {
		return new ResponseEntity<Customer>(cs.getCustomerByName(cname), HttpStatus.OK);

	}

	// fetching Customer details by phone using get mapping
	@GetMapping("/getcbycphone/{phone}")
	public ResponseEntity<Customer> getPbyphone(@PathVariable("phone") long phone) {
		return new ResponseEntity<Customer>(cs.getCustomerByPhone(phone), HttpStatus.OK);
	}
}
