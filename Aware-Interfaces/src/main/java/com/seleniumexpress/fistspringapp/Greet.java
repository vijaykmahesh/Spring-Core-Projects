package com.seleniumexpress.fistspringapp;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class Greet implements MessageSourceAware {

	
	
	@Override
	public void setMessageSource(MessageSource messageSource) {
		System.out.println("#MessageSourceAware");
		String message = messageSource.getMessage("greet", null, Locale.CHINA);
		System.out.println(message);
		
	}

}