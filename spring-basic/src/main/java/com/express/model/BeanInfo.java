package com.express.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.stereotype.Component;

@Component
public class BeanInfo implements BeanFactoryAware {

	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		boolean singleton = beanFactory.isSingleton("game");
		
		System.out.println("is singleton" +singleton);
	}

}
