package com.express.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exam {
	
	public static void main(String[] args) {
		
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
	System.out.println("config loaded");
		
	Student student =  applicationContext.getBean("vijay", Student.class);
	
	student.displayInfo();
		
	}  

}
