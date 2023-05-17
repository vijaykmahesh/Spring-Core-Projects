package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig {

	@Bean
	//(initMethod = "anotherInit") // calling init() using @Bean annotation
	public Teacher teacher() {

		return new Teacher();
	}

}
