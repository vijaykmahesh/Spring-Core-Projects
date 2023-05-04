package com.seleniumexpress.fistspringapp.service;

import org.springframework.stereotype.Component;

import com.seleniumexpress.fistspringapp.myannotaion.GapyProfile;

@Component
@GapyProfile
public class GpayPaymentGateway implements PaymentGateway {

	@Override
	public void pay(int amount) {
	
		System.out.println("paying through gpay..");
		System.out.println("payment processing for amount : " + amount);
	}

}
