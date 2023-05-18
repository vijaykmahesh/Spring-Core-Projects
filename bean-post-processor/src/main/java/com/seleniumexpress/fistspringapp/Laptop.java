package com.seleniumexpress.fistspringapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Laptop {

	private Battery battery;
	
	public Laptop() {
		
		System.out.println("laptop is initializing");
	}

	@Autowired
	public void setBattery(Battery battery) {
		
		System.out.println("setting property for battery");
		
		this.battery = battery;
	}
	
	public void init() {
		
		System.out.println("inside init()");
	}


	public void chargeLaptop() {

		battery.charge();
	}

}
