package com.cp.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.cp.SimpleRunException;

@ControllerAdvice
public class RestResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler({ SimpleRunException.class })
    protected ResponseEntity<Void> handleException(SimpleRunException ex) {
        System.out.println("Error Handled .." + ex);
        return ResponseEntity.notFound().build();
    }

}
