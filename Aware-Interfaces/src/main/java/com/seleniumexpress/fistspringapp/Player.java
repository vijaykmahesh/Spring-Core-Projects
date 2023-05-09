package com.seleniumexpress.fistspringapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Player implements BeanNameAware, ApplicationContextAware {

	ApplicationContext context;

	Game game;

	// 1st constructor will be intialized
	public Player() {

		System.out.println("Bean Intialization process Player()");
	}

	public void play() {

		// intialize game object
		// ask application context get me the game object
		game = context.getBean(Game.class);
		game.startGame();
	}

	// callback it will be automatically called
	@Override
	public void setBeanName(String name) {

		System.out.println("setBeanName()" + name);

	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

		this.context = applicationContext;
	}

}
