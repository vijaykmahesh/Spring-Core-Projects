package com.express.di;

public class AnotherStudent {
	
	private MathCheat matCheat;

	public void setMatCheat(MathCheat matCheat) {
		this.matCheat = matCheat;
	}
	
	public void startCheating() {
		
		matCheat.mathCheat();
	}
	

}
