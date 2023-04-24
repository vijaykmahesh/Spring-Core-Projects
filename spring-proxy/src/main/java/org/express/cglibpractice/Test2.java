package org.express.cglibpractice;

import org.springframework.cglib.proxy.Enhancer;

public class Test2 {

	public static void main(String[] args) {

		final RAM targetRam = new RAM();

		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(targetRam.getClass());
		enhancer.setCallback(new RamMethodInterceptor());

		// creating CGLib Proxy
		RAM ramProxy = (RAM) enhancer.create();

		ramProxy.getSize(); // which will call anonymous method inside --> RamMethodInterceptor
		ramProxy.getPrice();

		// Internally spring is extending ur class and calling the method.
		// Just make ur class as final it won't be working because then it won't able to
		// extend class.

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
