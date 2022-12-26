package com.express.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	
	@Autowired
	@Qualifier("humanHeart")
	private Heart heart;
	
//	
//	public void setHeart(Heart heart) {
//		System.out.println("setter method called");
//		this.heart = heart;
//	}
//
//
//	public Human() {
//		// TODO Auto-generated constructor stub
//	}
//
//	
//	public Human(Heart heart) {
//		System.out.println("Human Constructor called which has heart as argument");
//		this.heart = heart;
//	}

	public void startPumping() {

		if (heart != null) {
			heart.pump();
			System.out.println("name of animal is "+heart.getNameOfAnimal() + "no of heart" +heart.getNoOfHeart());
		} else
			System.out.println("You are Dead");

	}

}
