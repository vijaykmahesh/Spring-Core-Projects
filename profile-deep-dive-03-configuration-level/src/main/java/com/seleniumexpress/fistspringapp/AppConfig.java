package com.seleniumexpress.fistspringapp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.seleniumexpress.fistspringapp.service.PaymentGateway;
import com.seleniumexpress.fistspringapp.service.PaymentProcesser;

@Configuration
@Import(value = {GapyGatewayConfig.class,PaypalGatewayConfig.class})
public class AppConfig {

	@Bean
	public PaymentProcesser paymentProcesser(PaymentGateway paymentGateway) {

		return new PaymentProcesser(paymentGateway);
	}

}
