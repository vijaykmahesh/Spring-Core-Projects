package com.seleniumexpress.fistspringapp;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

		 AnnotationConfigApplicationContext container = new  AnnotationConfigApplicationContext(AppConfig.class);

//		 StudentInfoPrinter studentInfoPrinter = container.getBean(StudentInfoPrinter.class);
//		 
//		 studentInfoPrinter.printStudentInfo();
		 
		 Film film = container.getBean(Film.class);
		 film.startFilm();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
//		 
//		Person p = new Person();
//
//		System.out.println(p);
//		
//		Student s = new Student();
////		s.setName(p.getName());
////		s.setAddress(p.getAddress());
////		
////		System.out.println(s);
//		
//		//without using setter how to copy person values to student
//		//third party library
//		ModelMapper md = new ModelMapper();
//		md.map(p, s);
//		
//		System.out.println("using model mapper "+s);
	}
}
