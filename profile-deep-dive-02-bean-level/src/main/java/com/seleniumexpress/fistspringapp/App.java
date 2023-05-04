package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.seleniumexpress.fistspringapp.service.PaymentProcesser;

public class App 
{
    public static void main( String[] args )
    {
    	
    	AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext();
    	
    	container.getEnvironment().setActiveProfiles("gpay");
    	container.register(AppConfig.class);
    	
    	container.refresh();
        
  
    	container.getBean(PaymentProcesser.class).doPayment(20000);
    	
    }
}

















