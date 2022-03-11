package com.cp.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cp.model.Product;
import com.cp.service.IProductService;

@RestController
public class ProductController implements IProductController {
	
	private IProductService productService;
	
	public ProductController(IProductService productService) {
		this.productService = productService;
	}
	
	/**
	 * 
	 * Get All products available in DB. Thus returns a list of products
	 */
	@GetMapping("/product")
	public ResponseEntity<List<Product>> getProducts() {
		return ResponseEntity.ok(productService.getAllProducts());
	}
	
	/**
	 * 
	 * Get Specific product by ID ID is a OK. So it should return only one product.Path param is used here.
	 */
	
	@GetMapping("/product/{id}")
	public ResponseEntity<Product> getProducts(@PathVariable Long id) {
		return ResponseEntity.ok(productService.getProductById(id));
	}
	
	
	/*
	 * 
	 * Saves a product into db. The request body contains json object , 
	 * that is serialized/de-serialized to POJO.
	 */
	@PostMapping("/product")
	public ResponseEntity<Void> saveProduct(@RequestBody Product product){
		
			ResponseEntity response;
			boolean status = productService.saveProduct(product);
			
			if(status) {
				response =  ResponseEntity.status(HttpStatus.CREATED).build();
			}else {
				response = ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
			}
		
		return response;
	}
	
	
	/*
	 * 
	 * Updated a product into db. The request body contains json object , 
	 * that is serialized/de-serialized to POJO. The response is the modified object.
	 */
	@PutMapping("/product")
	public ResponseEntity<Product> updateProduct(@RequestBody Product product){
		return ResponseEntity.ok(productService.updateProduct(product));
	}
	
	
	/*
	 * 
	 * Delete an product using ID.
	 */
	@DeleteMapping("/product/{id}")
	public ResponseEntity<Void> deleteProduct(@PathVariable Long id){
		productService.deleteProduct(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}

}
