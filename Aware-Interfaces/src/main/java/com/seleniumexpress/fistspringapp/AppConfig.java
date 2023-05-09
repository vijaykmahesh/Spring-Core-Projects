package com.seleniumexpress.fistspringapp;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ResourceBundleMessageSource;

@Configuration
@ComponentScan
@PropertySource("classpath:myapp.properties")
public class AppConfig {
	
	@Bean
	@Scope("prototype")
	public Player player1() {
		
		return new Player();
	}
	
	@Bean
	public Player player2() {
		
		return new Player();
	}
	
	@Bean
	public MessageSource messageSource() {
		
		ResourceBundleMessageSource bundleMessageSource = new ResourceBundleMessageSource();
		bundleMessageSource.setBasename("greet");
		bundleMessageSource.setDefaultEncoding("UTF-8");
		
		return bundleMessageSource;
	}

}
