package com.bank.sprint1.service;

import java.util.List;

import com.bank.sprint1.entity.Transaction;

public interface TransactionService {

	// defining methods to perform transaction related operations
	List<Transaction> getAllTransactions();

	Transaction getTransactionById(String transactionId);

	List<Transaction> getTransactionByType(String transactionType);

}
