package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class Appleexception extends RuntimeException {
               
	
	private static final long serialVersionUID = 1L;

	public Appleexception(String message) {
		super(message);
	}
}
