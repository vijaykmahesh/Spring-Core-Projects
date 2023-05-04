package com.seleniumexpress.fistspringapp.service;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.seleniumexpress.fistspringapp.model.Product;

@Component
@Profile("file")
//@Profile("!database")
public class FileDAOImpl implements ProductDAO {

	@Override
	public List<Product> getAllProducts() throws ClassNotFoundException, SQLException {

		Product p1 = new Product();
		p1.setId(1);
		p1.setName("mouse - file ");

		Product p2 = new Product();
		p2.setId(2);
		p2.setName("mouse pad - file ");

		return Arrays.asList(p1, p2);
	}

}
