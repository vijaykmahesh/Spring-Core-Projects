package com.express.demo;

public class StudentProxy extends Student {

	public StudentProxy(Attendance attendance) {
		super(attendance);
	}

	@Override
	public void attendLesson() {

		if (super.getAttendance().isPresent()) {
			super.attendLesson();
		} else {

			throw new RuntimeException("Student is not present");
		}

	}

}
