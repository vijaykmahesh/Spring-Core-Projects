package org.express.firstspringapp;

import org.express.proxy.ProductDAOImpl;
import org.express.proxy.ProductDAOImplProxy;

public class App {
	public static void main(String[] args) {

//		ProductDAOImpl product = new ProductDAOImpl();
//		
//		Product productFetched = product.getProductById(1);
//		
//		product.saveProduct(productFetched);

		ProductDAOImplProxy proxy = new ProductDAOImplProxy(new ProductDAOImpl());
		proxy.getProductById(1);

	}
}
