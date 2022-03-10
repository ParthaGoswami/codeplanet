package com.cp.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cp.model.Product;

@Repository
public class ProductRepository implements IProductRepository {
	
	private static String SELECT_PRODUCTS = "select * from product";
	
	
	private JdbcTemplate jdbcTemplate;
	
	public ProductRepository(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate =  jdbcTemplate;
	}

	@Override
	public List<Product> getProducts() {


		return jdbcTemplate.query(SELECT_PRODUCTS, 
				(rs , rowNum) -> {
						Product product = new Product();
						product.setProductId(rs.getLong("id"));
						product.setProductName(rs.getString("name"));
						product.setProductDesc(rs.getString("desc"));
						product.setPrice(rs.getDouble("price"));
					 return product;
				});
	}

	

}
