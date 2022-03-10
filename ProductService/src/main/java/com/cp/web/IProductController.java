package com.cp.web;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.cp.model.Product;

public interface IProductController {
	
	public ResponseEntity<List<Product>> getProducts();

}
