package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		
		System.out.println("************** calling **************");
		
		Laptop bean = container.getBean(Laptop.class);
		
		bean.chargeLaptop();
	}
}
