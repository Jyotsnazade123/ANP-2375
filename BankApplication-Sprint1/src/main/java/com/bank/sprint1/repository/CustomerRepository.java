package com.bank.sprint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.bank.sprint1.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	// sql query to get Customer details by phone
	@Query("select c from Customer c where c.customerPhone=?1")
	Customer getCustomerByPhone(long customerPhone);
}
