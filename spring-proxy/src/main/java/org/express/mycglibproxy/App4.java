package org.express.mycglibproxy;

import org.springframework.aop.framework.ProxyFactoryBean;

public class App4 {
	
	public static void main(String[] args) {
		
		//creating product instance
		Product product = new Product();
		
		//creating proxy factory
		ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
		//givcing the product to factory
		proxyFactoryBean.setTarget(product);
		
		//getting object from factory
		// whenver we use class It returns a CGLIB proxy
		Product productProxy = (Product)proxyFactoryBean.getObject();
		productProxy.showProductInfo();
		
		//Whenever we use interface it uses JDKProxy
		
		//IProduct productProxy = (IProduct)proxyFactoryBean.getObject();
		
	}

}
