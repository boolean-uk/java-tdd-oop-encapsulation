package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testCarCreation() {
        Car car = new Car();

        Assertions.assertTrue(car instanceof Car);
    }

    @Test
    public void testChangeColor() {
        Car car = new Car();

        car.setColor("red");

        Assertions.assertTrue(car.getColor().equals("red"));
    }

    @Test
    public void testIsRechargable() {
        Car car = new Car();

        boolean isRechargable = car.getRechargable();

        Assertions.assertTrue(isRechargable);
    }

    @Test
    public void testRemoteControl() {
        Car car = new Car();

        boolean remoteControl = car.getRemoteControl();

        Assertions.assertTrue(remoteControl);

        car.setControlType(false);

        Assertions.assertFalse(car.getRemoteControl());
    }

    @Test
    public void testBatteryPercent() {
        Car car = new Car();

        float batteryPercent = car.getBatteryPercent();

        Assertions.assertEquals(100, batteryPercent);

        car.setBatteryPercent(34.23);

        Assertions.assertTrue(car.getBatteryPercent(), 34.23);
    }

}
