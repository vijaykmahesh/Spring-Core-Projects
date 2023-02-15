package com.express.config;

import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;

import com.express.model.Player;

@Configuration
@ComponentScan("com.*")
public class AppConfig {
	
	
	@Bean
	public Player player() {
		
		return new Player();
	}
	
	@Bean
	public MessageSource messageSource() {
		
		ResourceBundleMessageSource rbms = new ResourceBundleMessageSource();
		rbms.setBasename("greet");
		
		return rbms;
	}
	

}
