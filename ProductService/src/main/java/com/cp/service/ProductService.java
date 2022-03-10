package com.cp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cp.dao.IProductRepository;
import com.cp.model.Product;

@Service
public class ProductService implements IProductService {
	
	
	private IProductRepository productRepository;

	
	public ProductService(IProductRepository productRepository) {
		this.productRepository = productRepository;
	}
	
	public List<Product> getAllProducts() {
		
		List<Product> products = productRepository.getProducts();
		// process logic e.g calculate total product price = product price * GST%;
		return products;
	}

}
