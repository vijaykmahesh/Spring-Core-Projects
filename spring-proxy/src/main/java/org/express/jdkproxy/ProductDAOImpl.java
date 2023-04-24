package org.express.jdkproxy;

public class ProductDAOImpl implements ProductDAO {

	public Product getProductById(int id) {
		
		System.out.println("fetching product" +id);
		
		return new Product();
	}

	public void saveProduct(Product product) {
		
		//self invocation is not possible // this call will not go through proxy
		//Product fetchedProduct = getProductById(1);
		
		System.out.println("saving product" +product);
		
	}

}
