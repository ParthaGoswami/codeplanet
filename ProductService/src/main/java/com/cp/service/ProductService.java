package com.cp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cp.dao.IProductRepository;
import com.cp.exception.ProductNotFoundException;
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
	
	@Override
	public Product getProductById(Long productId) {
		// TODO Auto-generated method stub
		Optional<Product> productOptional = productRepository.getProductById(productId);
		
		if(productOptional.isEmpty()) {
			throw new ProductNotFoundException("Product With Id : " + productId +" , Not found");
		}
		return productOptional.get();
	}

	
	@Override
	public boolean saveProduct(Product product){
		boolean status = false;
		Integer result= productRepository.addProduct(product);
		if(result != null && result > 0) {
			status = true;			
		}		
		return status;
	}

	@Override
	public Product updateProduct(Product product) {
		Product productResponse = null;
		int result = productRepository.updateProduct(product);
		if(result > 0) {
			productResponse = productRepository.getProductById(product.getProductId()).get();
		}
		return productResponse;
	}

	@Override
	public boolean deleteProduct(Long productId) {
		boolean status = false;
		Integer result = productRepository.deleteProduct(productId);
		if(result > 0 ) {
			status = true;
		}
		return status;
	}

	

}
