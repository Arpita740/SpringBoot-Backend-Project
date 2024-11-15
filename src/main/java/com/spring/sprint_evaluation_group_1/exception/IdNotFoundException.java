package com.spring.sprint_evaluation_group_1.exception;


public class IdNotFoundException extends RuntimeException {

	String message;

	public IdNotFoundException(String message) {



	this.message=message;


	}

	public String getMessage() {

		return message;

	}

}