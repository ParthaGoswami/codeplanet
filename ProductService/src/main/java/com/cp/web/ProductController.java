package com.cp.web;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cp.model.Product;
import com.cp.service.IProductService;

@RestController
public class ProductController implements IProductController {
	
	private IProductService productService;
	
	public ProductController(IProductService productService) {
		this.productService = productService;
	}
	

	@GetMapping("/product")
	public ResponseEntity<List<Product>> getProducts() {
		
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	///@PostMapping , @PutMapping , @DeleteMapping
	// Get Products By Id  @GetMapping

}
