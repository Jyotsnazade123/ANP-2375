package com.anudip.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.anudip.jpa.entity.Customer;



//jpaRepository
public interface CustomerRepository extends JpaRepository <Customer, Long> {
	//customized query using jpql
	
			@Query("select c from Customer c where c.cName=?1")
			Customer getCustomerByName(String pName);
			
			@Query("select c from Customer c where c.phone=?1")
			Customer getCustomerByPhone(long phone);
	
}
