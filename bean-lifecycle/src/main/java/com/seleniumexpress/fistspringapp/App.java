package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
	public static void main(String[] args) {

//		// it internally uses autocloseable interface
//		try(AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class))
//		// try with resources and automatically called .close()
//		{
//		container.getBean(Teacher.class).teach();
//		}

		// second way to close
		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(AppConfig.class);
		container.getBean(Teacher.class).teach();
		container.registerShutdownHook(); // java way of closing
		// instruct JVM that hey JVM whenever u shutdown that tym when container is not
		// closed please destroy it.
	}
}
