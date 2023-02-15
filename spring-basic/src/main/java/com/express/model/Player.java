package com.express.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class Player implements BeanNameAware,ApplicationContextAware {
	
	ApplicationContext context;
	
	Game game;//null
	
	public Player() {
		System.out.println("player constructor");
	}
	
	public void playGame() {
		
		Game game =  context.getBean("game", Game.class);
		game.play();
		
	}

	public void setBeanName(String name) {
		// TODO Auto-generated method stub

		System.out.println("setBeanName");

	}

	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		this.context = applicationContext;
		
	}

}
