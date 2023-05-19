package com.express.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		
		//SingleTon
//		SingletonDemo Obj1 =  applicationContext.getBean("singletonBean",SingletonDemo.class);
//		
//		SingletonDemo Obj2 =  applicationContext.getBean("singletonBean",SingletonDemo.class);
//		
//		System.out.println(Obj1 == Obj2);
		
		
		//Prototype
//		PrototypeDemo Obj1 =  applicationContext.getBean("prototypeDemo",PrototypeDemo.class);
//		
//		PrototypeDemo Obj2 =  applicationContext.getBean("prototypeDemo",PrototypeDemo.class);
//		
//		System.out.println(Obj1 == Obj2);
		
		
//		School obj1 =  applicationContext.getBean("school",School.class);
//		
//		Student student =  obj1.getStudent();
//		System.out.println(student);
//		
//		Student student2 =  obj1.getStudent();
//		System.out.println(student2);
		
		
		ScopeTest obj1 =  applicationContext.getBean("request",ScopeTest.class);
		
		System.out.println(obj1);
		
	}

}
