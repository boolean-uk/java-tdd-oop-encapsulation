package com.booleanuk.core;

public class Car {
	String colour;
	String controlType = "Simple";
	double speed = 0;
	double turnAngle = 0;
	Battery battery;

	public Car() {
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setControlType(String controlType) {
		this.controlType = controlType;
	}

	public void forwards(double speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = speed;
		}
	}

	public void backwards(double speed) {
		if (speed < 0) {
			this.speed = 0;
		} else {
			this.speed = -speed;
		}	}

	public void stopSpeed() {
		this.speed = 0;
	}

	public void turnLeft(double degrees) {
		if(degrees<0) return;
		this.turnAngle += degrees;

	}

	public void turnRight(double degrees) {
		if(degrees<0) return;
		this.turnAngle -= degrees;
	}

	public void setBattery(Battery battery) {
		this.battery = battery;
	}
}
