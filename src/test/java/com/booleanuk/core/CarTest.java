package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

	@Test
	public void setColourTest(){
		Car car = new Car();
		car.setColour("Blue");
		Assertions.assertEquals("Blue",car.colour);
		car.setColour("Red");
		Assertions.assertEquals("Red",car.colour);
	}
	@Test
	public void setControlTypeTest(){
		Car car = new Car();
		Assertions.assertEquals("Simple", car.controlType);
		car.setControlType("Advanced");
		Assertions.assertEquals("Advanced",car.controlType);
	}
	@Test
	public void forwardsTest(){
		Car car = new Car();
		Assertions.assertEquals(0,car.speed);
		car.forwards(100);
		Assertions.assertEquals(100,car.speed);
		car.forwards(-100);
		Assertions.assertEquals(0,car.speed);

	}
	@Test
	public void backwardsTest(){
		Car car = new Car();
		car.backwards(100);
		Assertions.assertEquals(-100,car.speed);
		car.backwards(-100);
		Assertions.assertEquals(0,car.speed);
	}
	@Test
	public void stopSpeedTest(){
		Car car = new Car();
		car.forwards(100);
		Assertions.assertEquals(100,car.speed);
		car.stopSpeed();
		Assertions.assertEquals(0,car.speed);
		car.backwards(100);
		Assertions.assertEquals(-100,car.speed);
		car.stopSpeed();
		Assertions.assertEquals(0,car.speed);
	}
	@Test
	public void turnLeftTest(){
		Car car = new Car();
		Assertions.assertEquals(0,car.turnAngle);
		car.turnLeft(45);
		Assertions.assertEquals(45,car.turnAngle);
		car.turnLeft(45);
		Assertions.assertEquals(90,car.turnAngle);
		car.turnLeft(-10);
		Assertions.assertEquals(90,car.turnAngle);
	}
	@Test
	public void turnRightTest(){
		Car car = new Car();
		Assertions.assertEquals(0,car.turnAngle);
		car.turnRight(45);
		Assertions.assertEquals(-45,car.turnAngle);
		car.turnRight(45);
		Assertions.assertEquals(-90,car.turnAngle);
		car.turnRight(-10);
		Assertions.assertEquals(-90,car.turnAngle);
	}
	@Test
	public void setBatteryTest(){
		Car car = new Car();
		Battery battery= new Battery("Rechargeable");
		Battery battery2 = new Battery("Disposable");
		car.setBattery(battery);
		Assertions.assertEquals("Rechargeable",car.battery.type);
		car.setBattery(battery2);
		Assertions.assertEquals("Disposable",car.battery.type);
	}
	@Test
	public void getPercentageTest(){
		Battery battery = new Battery("Rechargeable");
		Assertions.assertEquals(100,battery.getPercentage());
		battery.percentage=60;
		Assertions.assertEquals(60,battery.getPercentage());
	}

}
