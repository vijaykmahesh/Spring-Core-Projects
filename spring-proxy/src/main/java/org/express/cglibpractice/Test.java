package org.express.cglibpractice;

import java.lang.reflect.Method;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

public class Test {

	public static void main(String[] args) {

		final RAM targetRam = new RAM();

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(targetRam.getClass());
		enhancer.setCallback(new MethodInterceptor() {
												// which ever method name     //MethodProxy has more functionalites then Method
			public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

				System.out.println("before invoking method");

				// method = getSize()
				Object ret = proxy.invokeSuper(obj, args); // which inturn calls actual method of RAM Class.
				System.out.println(ret);

				System.out.println("after invoking method");

				return ret;
			}
		});

		//creating CGLib Proxy
		RAM ramProxy = (RAM) enhancer.create();

		ramProxy.getSize(); // which will call anonymous method called --> intercept()
		ramProxy.getPrice();
		
		//Internally spring is extending ur class and calling the method.
		// Just make ur class as final it won't be working because then it won't able to extend class.

	}

}

//what happens internally is 

//
//class RAM{
//	
//	void abc() {}
//}
//
//Class RAMProxy extends RAM {
//	
//	@overqride
//	void abc() {
//		
//	sup.abc();
//		
//	}
//}


