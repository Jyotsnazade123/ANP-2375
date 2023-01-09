package com.bank.sprint1.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.sprint1.entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, String> {

	// SQl query to get All Transactions By AccountId.
	@Query("select t from Transaction t where t.transactionType=?1")
	List<Transaction> getTransactionByType(String transactionType);

}
