package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FullTest {
    @Test
    public void canChangeController() {
        Car car = new Car("blue", false, 0, 0, 100);
        Controller con1 = new Controller(false);
        Controller con2 = new Controller(true);
        Person p = new Person(car, con1);
        Assertions.assertNotEquals(con2, p.getController());
        p.setController(con2);
        Assertions.assertEquals(con2, p.getController());
    }

    @Test
    public void testGetBattery() {
        Controller con = new Controller(false);
        Car car = new Car("blue", false, 0, 0, 100);
        Assertions.assertEquals(100, con.seeBatteryPercentage(car));
    }

    @Test
    public void testMoveCar() {
        Car car = new Car("blue", false, 5, 0, 100);
        Controller con1 = new Controller(false);
        Assertions.assertEquals(0, car.getLocation());
        con1.moveCar(car, 10);
        Assertions.assertEquals(50, car.getLocation());
    }

    @Test
    public void testSetCarSpeed() {
        Car car = new Car("blue", false, 0, 0, 100);
        Controller con1 = new Controller(false);
        Assertions.assertEquals(0, car.getMotorPower());
        con1.setCarSpeed(car,10);
        Assertions.assertEquals(10, car.getMotorPower());
    }

    @Test
    public void testTurnWheels() {
        Car car = new Car("blue", false, 0, 0, 100);
        Controller con1 = new Controller(false);
        Assertions.assertEquals(0, car.getWheelDegree());
        con1.turnWheels(car, -10);
        Assertions.assertEquals(-10, car.getWheelDegree());
    }

    @Test
    public void testSetColor() {
        Car car = new Car("blue", false, 0, 0, 100);
        car.setColor("green");
        Assertions.assertEquals("green", car.getColor());
    }

    @Test
    public void testSetRechargeableBatteries() {
        Car car = new Car("blue", false, 0, 0, 100);
        car.setRechargeableBatteries(true);
        Assertions.assertTrue(car.getRechargeableBatteries());
    }
}
