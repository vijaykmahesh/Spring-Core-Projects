package com.express.di;

public class Student {
	
	private int studentId;
	private String studentName;
	
	

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}

//	public void setStudentId(int studentId) {
//		this.studentId = studentId;
//	}
//
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//	
	public void displayInfo() {
		System.out.println("student Id is "+studentId);
		System.out.println("student name is "+studentName);
		
	}
	
}
