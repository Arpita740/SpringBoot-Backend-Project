package com.spring.sprint_evaluation_group_1.exception;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.ControllerAdvice;

import org.springframework.web.bind.annotation.ExceptionHandler;

import com.spring.sprint_evaluation_group_1.dto.ResponseStructure;

@ControllerAdvice

public class GlobalException

{

	@ExceptionHandler(IdNotFoundException.class)

	public ResponseEntity<ResponseStructure<String>> handleIdNotFoundException(IdNotFoundException ex) {

		ResponseStructure<String> response = new ResponseStructure<>();

		response.setStatus(HttpStatus.NOT_FOUND.value());

		response.setMessage(ex.getMessage());

		response.setData(null);

		return new ResponseEntity<>(response, HttpStatus.NOT_FOUND);

	}

}