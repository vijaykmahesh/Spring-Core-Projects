package com.express.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Lookup;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_SINGLETON)
abstract public class School {

	@Autowired
	private Student student; // Prototype

	public School() {
		System.out.println("school constructor");
	}

	@Lookup
	abstract Student createStudent(); 
	public Student getStudent() {
		Student student =  createStudent();
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
