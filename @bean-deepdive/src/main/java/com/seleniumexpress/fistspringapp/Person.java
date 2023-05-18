package com.seleniumexpress.fistspringapp;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String name = "vijay";
	private String address = "bangalore";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", address=" + address + "]";
	}
	
	
	
	

}
