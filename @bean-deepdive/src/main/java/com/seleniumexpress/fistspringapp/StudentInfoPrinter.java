package com.seleniumexpress.fistspringapp;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentInfoPrinter {
	
	@Autowired
	private Person person;
	
	@Autowired
	private Student student;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public void printStudentInfo() {
		
		modelMapper.map(person, student);
		
		System.out.println(student);
	}

}
