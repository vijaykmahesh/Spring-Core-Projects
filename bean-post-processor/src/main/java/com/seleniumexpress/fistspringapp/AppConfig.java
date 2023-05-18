package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {
	
	// before all the bean is intialized create this bean since it is a special bean
	@Bean
	public static CustomBeanFactoryPostProcesser beanFactoryPostProcesser() {
		
		return new CustomBeanFactoryPostProcesser();
	}
	
	@Bean
	public static CustomBeanPostProcessor beanPostProcessing() {
		
		return new CustomBeanPostProcessor();
	}

}
