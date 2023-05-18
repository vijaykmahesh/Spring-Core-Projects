package com.seleniumexpress.fistspringapp;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

public class CustomBeanFactoryPostProcesser implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		
		// To alter the bean before it is intialized / created
		System.out.println("Inside CustomBeanFactoryPostProcesser -> postProcessBeanFactory() ");
		
//		String[] beanDefinitionNames = beanFactory.getBeanDefinitionNames();
//		
//		for (String beanName : beanDefinitionNames) {
//			
//			
//			BeanDefinition beanDefinition = beanFactory.getBeanDefinition(beanName);
//			
//			if(beanDefinition.getBeanClassName().endsWith("Laptop")) {
//				
//				beanDefinition.setScope(BeanDefinition.SCOPE_PROTOTYPE);
//				beanDefinition.setInitMethodName("init");
//			}
//			System.out.println("beanDefinition " + beanDefinition);
//			
//		}
	}

}
