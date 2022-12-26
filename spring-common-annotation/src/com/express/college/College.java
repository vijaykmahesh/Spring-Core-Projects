package com.express.college;



public class College {
	
	private Principle principle;
	
	

	public void setPrinciple(Principle principle) {
		this.principle = principle;
	}
	
	
//	public College(Principle principle) {
//		this.principle = principle;
//	}



	public void test() {
		System.out.println("testing");
		principle.principalInfo();
	}



}
