package com.bank.sprint1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bank.sprint1.entity.Transaction;
import com.bank.sprint1.service.TransactionService;

@RestController
//rest controller to handle all incoming request using REST API
public class TransactionController {

	@Autowired
	private TransactionService tservice;

	// fetching Transaction details by id using get mapping
	@GetMapping("/gettr/{transactionId}")
	public ResponseEntity<Transaction> getT(@PathVariable("transactionId") String transactionId) {
		return new ResponseEntity<Transaction>(tservice.getTransactionById(transactionId), HttpStatus.OK);
	}

	// fetching Transaction details using get mapping
	@GetMapping("/gettr")
	public List<Transaction> getAllT() {
		return tservice.getAllTransactions();
	}

	// fetching Transaction details by transactionType using get mapping
	@GetMapping("/gettype/{transactionType}")
	public List<Transaction> getBytype(@PathVariable("transactionType") String transactionType) {
		return tservice.getTransactionByType(transactionType);
	}

}
