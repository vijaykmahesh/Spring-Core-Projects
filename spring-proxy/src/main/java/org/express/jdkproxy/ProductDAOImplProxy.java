package org.express.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ProductDAOImplProxy implements InvocationHandler {

	ProductDAOImpl productDAOImpl;

	public ProductDAOImplProxy(ProductDAOImpl productDAOImpl) {
		this.productDAOImpl = productDAOImpl;
	}

	
	//targeting only ProductDAOImpl
										// getProductById 1
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

		//pre processing like connecting to DB
		new DBConnectionUtil().connectToDb();
		
		Object returnValue = method.invoke(productDAOImpl, args);
		
		//closing db connection
		new DBConnectionUtil().close();
		
		return returnValue;
	}

}
