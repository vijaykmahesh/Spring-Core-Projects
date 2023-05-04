package com.seleniumexpress.fistspringapp.service;

import org.springframework.stereotype.Component;

import com.seleniumexpress.fistspringapp.myannotaion.PaypalProfile;

@Component
@PaypalProfile
public class PaypalPaymentGateway implements PaymentGateway {

	@Override
	public void pay(int amount) {
	
		System.out.println("paying through paypal..");
		System.out.println("payment processing for amount : " + amount);
	}

}
