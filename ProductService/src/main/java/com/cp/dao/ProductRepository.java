package com.cp.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cp.model.Product;

@Repository
public class ProductRepository implements IProductRepository {
	
	private static String SELECT_PRODUCTS = "select * from product";
	private static String SELECT_PRODUCTS_BY_ID = "select * from product where id=?";
	private static String INSERT_PRODUCTS = "insert into product values (? , ? , ? , ?)";
	private static String UPDATE_PRODUCTS = "update product set name = ? , description = ? , price  = ? where id = ?";
	private static String DELETE_PRODUCT = "delete from product where id = ?";
	
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
						product.setProductDesc(rs.getString("description"));
						product.setPrice(rs.getDouble("price"));
					 return product;
				});
	}
	
	@Override
	public Optional<Product> getProductById(Long productId) {
		// TODO Auto-generated method stub
		
		String query =  "select * from product where id=" +productId;
		return jdbcTemplate.query(query,
				(rs , rowNum) -> {
						Product product = new Product();
						product.setProductId(rs.getLong("id"));
						product.setProductName(rs.getString("name"));
						product.setProductDesc(rs.getString("description"));
						product.setPrice(rs.getDouble("price"));
					 return product;
				}).stream().findFirst();
	}

	@Override
	public Integer addProduct(Product product) {
		
//		String query = "insert into product values (" + product.getProductId() + " , '" + product.getProductName() + " '" + " , ' " + product.getProductDesc() + " ' , " + product.getPrice() + ")";              	 
//		System.out.println("Query : "+ query);
		
		
		return jdbcTemplate.update(INSERT_PRODUCTS , product.getProductId(), 
									product.getProductName(), 
									product.getProductDesc(),
									product.getPrice()
							);
				
	}

	@Override
	public Integer updateProduct(Product product) {
		
	
		return jdbcTemplate.update(UPDATE_PRODUCTS , product.getProductName(),
				product.getProductDesc(),
				product.getPrice(),
				product.getProductId());
	}

	

	@Override
	public Integer deleteProduct(Long productId) {		
		return jdbcTemplate.update(DELETE_PRODUCT , productId );
	}

	

}
