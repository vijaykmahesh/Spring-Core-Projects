package com.express.college;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Client {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
		
		College college =  applicationContext.getBean("collegeBean", College.class);
		
		System.out.println("college bean is created" +college);
		
		college.test(); 
		
		((AnnotationConfigApplicationContext)applicationContext).close();
		
	}

}
