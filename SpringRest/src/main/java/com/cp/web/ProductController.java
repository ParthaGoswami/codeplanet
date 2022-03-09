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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cp.model.Product;

@RestController
public class ProductController {
	
	
	private List<Product> productList = new ArrayList<Product>();
	
	@PostMapping("/product")
    public ResponseEntity addProduct(@RequestBody Product product) {
		try {
			
			if(product.getId() == 000) {
				throw new Exception("Something Is Wrong");
			}
			
			productList.add(product);
			
		}catch(Exception e) {
			return ResponseEntity.status(400).build();
		}		
		return ResponseEntity.created(null).build();		
    }
  
    @GetMapping("/product")
    public ResponseEntity<List<Product>> getAllProducts() {
        return ResponseEntity.ok(productList);
    }
  
    @GetMapping("/product/{id}")
    public ResponseEntity<Product> getProductById(@PathVariable long id) {
    	
    	if(id == 000) {
    		return ResponseEntity.status(400).build();
    	}
    	    	
    	Product tempProduct = null;
    	
    	for(Product product : productList) {
    		
    		if(product.getId() == id) {
    			tempProduct = product;
    		}
    		
    	}
    	
    	return ResponseEntity.ok(tempProduct);
    	
    	
//    	
//        return ResponseEntity.ok(productList.stream()
//        		.filter(p -> p.getId() == id)
//        		.findFirst()
//        		.get());
    }
  
    @DeleteMapping("/product/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable long id , @RequestParam String name) {
    	productList.removeIf(p -> p.getId() == id);
    	return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
