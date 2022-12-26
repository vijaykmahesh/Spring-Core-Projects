package com.express.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mobile {
	
	public static void main(String[] args) {
		
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("config loaded");
		
//		Airtel airtel =  (Airtel)applicationContext.getBean("airtelObject");
//		airtel.calling();
//		airtel.data();
		
		
//		Vodafone voda =  applicationContext.getBean("vodafone", Vodafone.class);
//		voda.calling();
//		voda.data();
		
		
		Sim sim =  applicationContext.getBean("sim", Sim.class);
		sim.calling();
		sim.data();
		
		
		
		
	}

}
