package org.express.jdkproxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Date;

public class TimeLoggingProxy implements java.lang.reflect.InvocationHandler {

	Object targetObject;

	public TimeLoggingProxy(Object targetObject) {
		this.targetObject = targetObject;
	}

	
	// get proxy object of required
	public static Object getTimeLoggingProxy(Object object) {

		return Proxy.newProxyInstance(object.getClass().getClassLoader(), object.getClass().getInterfaces(),
				new TimeLoggingProxy(object));

	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		
		System.out.println("time on server" + new Date());
		Object ret  = method.invoke(targetObject, args);
		
		return ret;
	}

}
