package com.seleniumexpress.fistspringapp;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.stereotype.Component;

@Component
public class Teacher {

	private List<String> subjects;

	@PostConstruct
	// will be automatically called by spring by using java way
	public void init() {

		System.out.println("init invoked through @PostConstruct");
		subjects = new ArrayList<String>();
		subjects.add("science");
		subjects.add("math");

	}

//	public void anotherInit() {
//
//		System.out.println("inside anotherInit");
//	}

	public Teacher() {

		System.out.println("Teacher is intializing");

	}

	public void teach() {

		for (String subject : subjects) {

			System.out.println("teaching..." + subject);

		}

	}

	// spring way of intializing bean ryt after contsructor called, DI is done after
	// that afterPropertiesSet() will be called.
	// tightly coupled with spring

//	@Override
//	public void afterPropertiesSet() throws Exception {
//		
//		System.out.println("After Property Set called ");
//		//init();
//		
//	}
	
	@PreDestroy
	public void destroy() {
		
		//logic to free resources
		
		System.out.println("inside destroy()..");
		
		// when bean will be destroyed ?
		// when container is destroyed bean is also destroyed
	}

}
