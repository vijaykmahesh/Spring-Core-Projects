package com.express.model;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Component;

@Component
public class Greet implements MessageSourceAware {

	public void setMessageSource(MessageSource messageSource) {
		
		String message = messageSource.getMessage("greet", null, Locale.of("hi", "India"));
		
		System.out.println("#MessageSourceAware "+message);
		
	}

}
