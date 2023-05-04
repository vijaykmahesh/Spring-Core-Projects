package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.seleniumexpress.fistspringapp.service.GpayPaymentGateway;
import com.seleniumexpress.fistspringapp.service.PaypalPaymentGateway;

@Configuration
@Profile("paypal")
public class PaypalGatewayConfig {
	
	@Bean
	public PaypalPaymentGateway paypalPaymentGateway() {
		
		return new PaypalPaymentGateway();
	}

}
