package org.express.cglibpractice;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class RamMethodInterceptor implements MethodInterceptor {

	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		
		
		System.out.println("before invoking method");

		// method = getSize()
		Object ret = proxy.invokeSuper(obj, args); // which inturn calls actual method of RAM Class.
		System.out.println(ret);

		System.out.println("after invoking method");

		return ret;
	}

}
