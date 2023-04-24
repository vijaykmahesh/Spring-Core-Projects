package org.express.jdkproxy;

import java.lang.reflect.Proxy;

public class App {
	public static void main(String[] args) {

		// creating jdkproxy
		 ProductDAO productDAOProxy = (ProductDAO)Proxy.newProxyInstance(
				 		ProductDAO.class.getClassLoader(), 
				 		new Class[] {ProductDAO.class}, 
				 		new ProductDAOImplProxy(new ProductDAOImpl()));

		 productDAOProxy.getProductById(1);
		 
		 productDAOProxy.saveProduct(new Product());
		 
		 // below code will not work 
		 
//		 ProductDAOImpl productDAOImpl = (ProductDAOImpl)Proxy.newProxyInstance(
//			 		ProductDAO.class.getClassLoader(), 
//			 		new Class[] {ProductDAO.class}, 
//			 		new ProductDAOImplProxy(new ProductDAOImpl()));
//		 
//		 productDAOProxy.getProductById(1);
	}
}

//what JDK Proxy does internally is 

//interface MyInterface{
//	
//	
//}
//
//class Test implements MyInterface{
//	
//}
//
//class TestProxy implements MyInterface {
//	
//	
//}
//
//class Demo {
//	
//	public static void main(String[] args) {
//		
//		 //Test test = (Test)new TestProxy(); // this is what we are doing in line no 20 so it won' work
//		 
//		 //instead we should do
//		 MyInterface interface = (MyInterface)new TestProxy();
//		 
//	}
//	
//	
//}


