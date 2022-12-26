package com.express.college;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	
	@Bean
	public Principle pricipalBean() {
		
		return new Principle();
	}
	
	//Constructor Injection
	
//	@Bean
//	public College collegeBean() {
//	
//		College college = new College(pricipalBean());
//		return college;
//	}
	
	@Bean
	public College collegeBean() {
	
		College college = new College();
		college.setPrinciple(pricipalBean());
		return college;
	}


}
