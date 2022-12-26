package com.express.ioc;

public class Airtel implements Sim {
	
//	public Airtel() {
//		
//		System.out.println("Airtel Constructor");
//	}

	@Override
	public void calling() {
		System.out.println("Airtel Calling");
		
	}

	@Override
	public void data() {
		System.out.println("Airtel Data");
		
	}

}
