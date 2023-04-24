package org.express.prototypescope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test4 {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext container = new AnnotationConfigApplicationContext(ScopeConfig.class);

		System.out.println("container loaded");

		Computer computer = container.getBean(Computer.class);

		IRAM ram1 = computer.getRam();
		System.out.println(ram1);

		IRAM ram2 = computer.getRam();
		System.out.println(ram2);
	}

}
