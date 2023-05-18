package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("************** calling **************");
		
		container.getBean(Laptop.class).chargeLaptop();
		
		System.out.println("************** end **************");
		
		System.out.println("************** container shutting down **************");
		
		container.close();
	}
}
