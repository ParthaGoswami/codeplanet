package com.cp.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ProductExceptionHandler {
	
	
	@ExceptionHandler({ProductNotFoundException.class})
	public ResponseEntity<Void> handleException(ProductNotFoundException ex) {
		ex.printStackTrace();
		return ResponseEntity.notFound().build();
	}

}
