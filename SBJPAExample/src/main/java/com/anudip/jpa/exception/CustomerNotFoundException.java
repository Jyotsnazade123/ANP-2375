package com.anudip.jpa.exception;

//custom exception to handle customer entity
public class CustomerNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	public CustomerNotFoundException(String message) {
		super (message);
	}

}
