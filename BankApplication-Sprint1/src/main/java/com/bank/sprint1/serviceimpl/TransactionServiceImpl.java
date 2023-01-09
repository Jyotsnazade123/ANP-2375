package com.bank.sprint1.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.sprint1.entity.Transaction;
import com.bank.sprint1.exception.TransactionNotFoundException;
import com.bank.sprint1.repository.TransactionRepository;
import com.bank.sprint1.service.TransactionService;

@Service
//implement all my CRUD method, all business logic
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	TransactionRepository trepo;

	// fetching all transaction details from table using findAll() of JpaRepository
	@Override
	public List<Transaction> getAllTransactions() {
		return trepo.findAll();
	}

	// fetching all transaction details from table based on id,if not found then
	// throw exception
	@Override
	public Transaction getTransactionById(String transactionId) {
		return trepo.findById(transactionId)
				.orElseThrow(() -> new TransactionNotFoundException("Entered transaction id not found"));
	}

	// finding transaction by transaction type
	@Override
	public List<Transaction> getTransactionByType(String transactionType) {
		return trepo.getTransactionByType(transactionType);
	}

}
