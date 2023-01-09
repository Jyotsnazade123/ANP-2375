package com.bank.sprint1.exception;

public class CustomerNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	// using constructor passing message to display
	public CustomerNotFoundException(String message) {
		super(message);
	}

}
