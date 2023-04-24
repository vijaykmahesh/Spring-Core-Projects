package org.express.prototypescope;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Computer {
	
	@Autowired
	private IRAM ram; //LAZY

	public Computer() {
		
		System.out.println("Initializing computer");
	}

	public IRAM getRam() {
		return ram;
	}

	public void setRam(RAM ram) {
		this.ram = ram;
	}
	
}
