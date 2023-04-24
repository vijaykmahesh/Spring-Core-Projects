package org.express.jdkproxy;

public class TimeLoggingProxyTest {
	
	public static void main(String[] args) {
		
		ProductDAO productDAO = (ProductDAO)TimeLoggingProxy.getTimeLoggingProxy(new ProductDAOImpl());
		
		productDAO.getProductById(1);
		productDAO.saveProduct(new Product());
		
	}

}
