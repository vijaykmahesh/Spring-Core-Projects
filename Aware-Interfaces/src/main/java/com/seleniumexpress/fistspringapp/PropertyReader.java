package com.seleniumexpress.fistspringapp;

import org.springframework.context.EnvironmentAware;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertyReader implements EnvironmentAware{

	
	Environment env;
	
	public void readProp() {
		
		System.out.println(env.getProperty("name"));
	}

	@Override
	public void setEnvironment(Environment environment) {
		this.env =environment;
		
	}
}
