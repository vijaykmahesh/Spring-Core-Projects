package com.express.demo;

public class Student implements DailySession {
	
	private Attendance attendance;
	
	

	public Attendance getAttendance() {
		return attendance;
	}



	public void setAttendance(Attendance attendance) {
		this.attendance = attendance;
	}



	public Student(Attendance attendance) {
		this.attendance = attendance;
	}



	@Override
	public void attendLesson() {
		
		System.out.println("Attending Lesson");
	}

}
