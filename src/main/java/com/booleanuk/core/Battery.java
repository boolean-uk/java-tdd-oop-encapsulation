package com.booleanuk.core;

public class Battery {
	String type;
	double percentage = 100.0;
	public Battery(String type){
		this.type=type;
	}

	public double getPercentage() {
		return this.percentage;
	}
}
