package com.express.model;

import java.util.Locale;

import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;

public class Internalization implements MessageSourceAware {

	public void setMessageSource(MessageSource messageSource) {
		
		String source =  messageSource.getMessage("greet", null, Locale.US);
		
	}

}
