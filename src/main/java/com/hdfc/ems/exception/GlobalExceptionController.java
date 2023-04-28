package com.hdfc.ems.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionController {


	@ExceptionHandler(EmployeeNotFound.class)
	public ResponseEntity<String> handleBookExp(EmployeeNotFound e){
		return new ResponseEntity<>(e.getMessage(),HttpStatus.BAD_REQUEST);
	}
}


