package com.anudip.jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.anudip.jpa.entity.Customer;


//jpaRepository
public interface CustomerRepository extends JpaRepository <Customer, Long> {

	
}
