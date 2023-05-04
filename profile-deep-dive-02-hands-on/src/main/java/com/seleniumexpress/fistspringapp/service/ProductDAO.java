package com.seleniumexpress.fistspringapp.service;

import java.sql.SQLException;
import java.util.List;

import com.seleniumexpress.fistspringapp.model.Product;

public interface ProductDAO {

	List<Product> getAllProducts() throws ClassNotFoundException, SQLException;
}
