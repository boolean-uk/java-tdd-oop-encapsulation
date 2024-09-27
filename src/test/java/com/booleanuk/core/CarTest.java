package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testSetColor() {
        Battery battery = new Battery("disposable");
        Car car = new Car("", battery, false);
        Assertions.assertNull(car.getColor());
        Assertions.assertTrue(car.setColor("Black"));
        Assertions.assertFalse(car.setColor("\n\r\t"));
    }

    @Test
    public void testSetBattery() {
        Battery battery = new Battery("disposable");
        Car car = new Car("Red", battery, false);
        Assertions.assertEquals("disposable", car.getBattery().getType());
        car.replaceBattery("rechargeable");
        Assertions.assertEquals("rechargeable", car.getBattery().getType());
    }

    @Test
    public void testSetControl() {
        Battery battery = new Battery("disposable");
        Car car = new Car("Red", battery, false);
        Assertions.assertFalse(car.hasAdvancedControl());
        car.setHasAdvancedControl(true);
        Assertions.assertTrue(car.hasAdvancedControl());
    }

    @Test
    public void testGetBatteryPercentage() {
        Battery battery = new Battery("disposable");
        Car car = new Car("Red", battery, false);
        Assertions.assertEquals(100, car.getBattery().getPercentage());
        car.getBattery().setPercentage(80);
        Assertions.assertEquals(80, car.getBattery().getPercentage());
    }

    @Test
    public void testMoveCar() {
        Battery battery = new Battery("disposable");
        Car car = new Car("Red", battery, false);
        Assertions.assertEquals("The car moved forth 1 kilometer(s).", car.moveCar("forth", 1));
        Assertions.assertTrue(car.isMoving());
        car.stopCar();
        Assertions.assertFalse(car.isMoving());
        Assertions.assertEquals("The car moved back 2 kilometer(s).", car.moveCar("back", 2));
    }

    @Test
    public void testTurnCar() {
        Battery battery = new Battery("disposable");
        Car car = new Car("Red", battery, false);
        Assertions.assertEquals("The car turned left.", car.turnCar("left"));
        Assertions.assertEquals("left", car.getDirection());
    }
}
