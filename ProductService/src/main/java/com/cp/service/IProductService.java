package com.cp.service;

import java.util.List;

import com.cp.model.Product;

public interface IProductService {
	
	public List<Product> getAllProducts();
	
	public Product getProductById(Long productId);
	
	public boolean saveProduct(Product product) ;
	
	public Product updateProduct(Product product);
	
	public boolean deleteProduct(Long productId);
	


}
