package org.express.jdkproxy;

public interface ProductDAO {
	
	public Product getProductById(int id);
	public void saveProduct(Product product);

}
