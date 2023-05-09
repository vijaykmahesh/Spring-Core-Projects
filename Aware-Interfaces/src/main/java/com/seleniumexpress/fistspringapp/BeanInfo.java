package com.seleniumexpress.fistspringapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

// print bean related info
@Component
public class BeanInfo implements BeanFactoryAware {

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("is it Singleton" + beanFactory.isSingleton("player1"));
		
		System.out.println("is it Singleton" + beanFactory.isSingleton("player2"));
		
	}

}
