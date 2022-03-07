package com.cp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cp.model.Product;

@RestController
public class ProductController {
	
	
	private List<Product> productList = new ArrayList<Product>();
	
	@PostMapping("/product")
    public ResponseEntity addProduct(@RequestBody Product product) {
		productList.add(product);
		return ResponseEntity.created(null).build();
    }
  
    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productList);
    }
  
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
    	
        return ResponseEntity.ok(productList.stream()
        		.filter(p -> p.getId() == id)
        		.findFirst()
        		.get());
    }
  
    @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id) {
    	productList.removeIf(p -> p.getId() == id);
    	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
