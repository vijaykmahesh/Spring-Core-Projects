package org.express.prototypescope;

import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = "prototype",proxyMode = ScopedProxyMode.INTERFACES)
public class RAM implements IRAM {
	
	private int price = 100;
	private String size = "64GB";
	
	
	public RAM() {
		
		System.out.println("Intializing RAM");
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}


	public String getSize() {
		return size;
	}


	public void setSize(String size) {
		this.size = size;
	}
	

}
