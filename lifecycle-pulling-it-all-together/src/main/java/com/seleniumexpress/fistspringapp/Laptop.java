package com.seleniumexpress.fistspringapp;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;

//@Component
public class Laptop implements InitializingBean, BeanNameAware,BeanFactoryAware,DisposableBean {

	private Battery battery;

	public Laptop() {

		System.out.println("laptop is initializing");
	}

	@Autowired
	public void setBattery(Battery battery) {

		System.out.println("setting property for battery");

		this.battery = battery;
	}

	@PostConstruct
	public void runAtStart() {

		System.out.println("running at first : @PostConstruct");
	}

	public void initMethod() {

		System.out.println("inside initMethod()");
	}

	public void chargeLaptop() {

		battery.charge();
	}

	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("inside afterPropertiesSet() ");
	}

	@Override
	public void setBeanName(String name) {

		System.out.println("#BeanNameAware");

	}

	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
		
		System.out.println("#BeanFactoryAware");
		
	}
	
	@Override
	public void destroy() throws Exception {
		
		System.out.println("#destroy() using disposable Bean ");
		
	}
	
	//destroy
	
	@PreDestroy
	public void destroy1() {
		
		System.out.println("#destroy1() : @PreDestroy");
	}
	
	public void myOwnDestroy() {
		
		System.out.println("#myOwnDestroy() : bean destroy property");
		
	}

}
