package com.bank.sprint1.controller;

import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.sprint1.entity.Login;
import com.bank.sprint1.service.LoginService;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
//rest controller to handle all incoming request using REST API
public class LoginController {
	@Autowired
	LoginService loginservice;

	// saving login details using post mapping
	@PostMapping("/login")
	public String validate(@RequestBody Login user) throws ServletException {
		String jwtToken = "";

		if (user.getUserName() == null || user.getPassword() == null) {
			throw new ServletException("Please fill username and password");
		}
		String userName = user.getUserName();
		String userPassword = user.getPassword();
		user = loginservice.loginUser(userName, userPassword);

		if (user == null) {
			throw new ServletException("user not found");
		}

		jwtToken = Jwts.builder().setSubject(userName).claim("roles", "user").setIssuedAt(new Date())
				.signWith(SignatureAlgorithm.HS256, "secretkey").compact();

		return jwtToken;
	}
}