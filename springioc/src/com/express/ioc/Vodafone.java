package com.express.ioc;

public class Vodafone implements Sim {

	@Override
	public void calling() {
		System.out.println("Vodafone Calling");
	}

	@Override
	public void data() {
		
		System.out.println("Vodafone Data");
	}

}
