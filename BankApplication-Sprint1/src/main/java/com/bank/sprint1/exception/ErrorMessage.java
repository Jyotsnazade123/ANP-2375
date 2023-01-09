package com.bank.sprint1.exception;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//importing all the annotation from lombok for getter,setter and constructor
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorMessage {

	// creating instance variable
	private HttpStatus status;
	private String message;
}
