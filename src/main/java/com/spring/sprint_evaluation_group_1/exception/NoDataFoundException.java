package com.spring.sprint_evaluation_group_1.exception;

public class NoDataFoundException extends RuntimeException
{
	private String message;

	public NoDataFoundException(String message) {
		this.message = message;
	}
	public NoDataFoundException() {
		
	}
	@Override
	public String getMessage()
	{
		return message;
	}
}