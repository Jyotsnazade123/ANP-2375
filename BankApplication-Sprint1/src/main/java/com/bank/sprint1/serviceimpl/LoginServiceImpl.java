package com.bank.sprint1.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.sprint1.entity.Login;
import com.bank.sprint1.repository.LoginRepository;
import com.bank.sprint1.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	LoginRepository lrepo;

	@Override
	public Login loginUser(String userName, String password) {
		Login login = lrepo.findByUserNameAndPassword(userName, password);
		return login;
	}

}