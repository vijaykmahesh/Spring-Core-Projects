package com.express.di;

public class Student {
	
	private String id;
	private MathCheat mathCheat;


	public void setId(String id) {
		this.id = id;
	}

	public void setMathCheat(MathCheat mathCheat) {
		this.mathCheat = mathCheat;
	}

	public void cheating() {
		
		mathCheat.mathCheat();
	}
}
