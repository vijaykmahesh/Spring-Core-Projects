package com.seleniumexpress.fistspringapp.service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import com.seleniumexpress.fistspringapp.model.Product;

@Repository
@Profile("database")
public class ProductDAOImpl implements ProductDAO{
	
	@Autowired
	IConnection connection;

	@Override
	public List<Product> getAllProducts() throws ClassNotFoundException, SQLException {
		
		List<Product> productList = new ArrayList<Product>();
		
		//execute an query
		PreparedStatement prepareStatement = connection.getConnection().prepareStatement("select * from products");
		
		ResultSet resultSet = prepareStatement.executeQuery();
		
		//returning the products
		while(resultSet.next()) {
			Product product = new Product();
			
			int productId = resultSet.getInt(1);
			String productName = resultSet.getString(2);
			
			product.setId(productId);
			product.setName(productName);
			
			productList.add(product);
		}
		
		return productList;
	}
	
	
	
	
	

}
