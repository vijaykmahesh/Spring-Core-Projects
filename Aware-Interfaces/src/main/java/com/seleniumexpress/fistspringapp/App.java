package com.seleniumexpress.fistspringapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		
		
		container.getBean(PropertyReader.class).readProp();
	}
}
