package com.express.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		System.out.println("config loaded");
			
		Student student =  applicationContext.getBean("studentObject", Student.class);
		
		student.cheating();
		
		AnotherStudent anotherStudent =  applicationContext.getBean("anotherStudentObject", AnotherStudent.class);
		
		anotherStudent.startCheating();
			
	}

}
