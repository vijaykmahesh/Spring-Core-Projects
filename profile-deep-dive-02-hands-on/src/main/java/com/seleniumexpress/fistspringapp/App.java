package com.seleniumexpress.fistspringapp;

import java.sql.SQLException;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seleniumexpress.fistspringapp.service.ProductDAO;

public class App {
	public static void main(String[] args) throws BeansException, ClassNotFoundException, SQLException {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
		container.registerShutdownHook();

		// container.getEnvironment().setActiveProfiles("database","prod");
		container.register(AppConfig.class);
		container.refresh();

		System.out.println(container.getBean(ProductDAO.class).getAllProducts());

		// System.out.println(container.getBean(Test.class).getClass().getSimpleName());

	}
}
