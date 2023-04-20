package com.express.demo;

import java.util.Date;

public class Client {
	
	public static void main(String[] args) {
		DailySession dailySession = new StudentProxy(new Attendance(new Date(), false));
		
		
		dailySession.attendLesson();
		
	}

}
