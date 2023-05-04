package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.seleniumexpress.fistspringapp.service.GpayPaymentGateway;

@Configuration
@Profile("gpay")
public class GapyGatewayConfig {
	
	@Bean
	public GpayPaymentGateway gapayPaymentGateway() {
		
		return new GpayPaymentGateway();
	}

}
