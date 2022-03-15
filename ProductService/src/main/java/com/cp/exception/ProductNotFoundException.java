package com.cp.exception;

public class ProductNotFoundException extends RuntimeException{
	
	
	private static final long serialVersionUID = -1929015179224132307L;

	public ProductNotFoundException(String msg) {
		super(msg);
	}

}
