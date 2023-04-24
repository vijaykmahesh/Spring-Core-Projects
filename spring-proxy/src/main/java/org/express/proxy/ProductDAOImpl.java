package org.express.proxy;

public class ProductDAOImpl implements ProductDAO {

	public Product getProductById(int id) {
		
		//connecting to DB
		
		System.out.println("fetching product" +id);
		
		//closing connection
		return new Product();
	}

	public void saveProduct(Product product) {
		
		//connecting to DB
		System.out.println("saving product" +product);
		
		//closing connection
	}

}
