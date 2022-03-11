package com.cp.dao;

import java.util.List;

import com.cp.model.Product;

public interface IProductRepository {
	
	public List<Product> getProducts();
	
	public Product getProductById(Long productId);
	
	public Integer addProduct(Product product);
	
	public Integer updateProduct(Product product);
	
	public Integer deleteProduct(Long productId);

}
