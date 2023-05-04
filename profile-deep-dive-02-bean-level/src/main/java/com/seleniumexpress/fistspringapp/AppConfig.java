package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.seleniumexpress.fistspringapp.service.GpayPaymentGateway;
import com.seleniumexpress.fistspringapp.service.PaypalPaymentGateway;

@Configuration
@ComponentScan
public class AppConfig {
	
	@Bean
	@Profile("gpay")
	public GpayPaymentGateway gapayPaymentGateway() {
		
		return new GpayPaymentGateway();
	}
	
	@Bean
	@Profile("paypal")
	public PaypalPaymentGateway paypalPaymentGateway() {
		
		return new PaypalPaymentGateway();
	}

}
