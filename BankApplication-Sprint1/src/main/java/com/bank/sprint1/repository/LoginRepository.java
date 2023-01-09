package com.bank.sprint1.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bank.sprint1.entity.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {
	public Login findByUserNameAndPassword(String userName, String Password);

}
