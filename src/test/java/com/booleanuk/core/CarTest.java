package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void chooseColourTest() {
        Car car = new Car();
        Assertions.assertEquals("blue", car.chooseColour("blue"));
    }
    @Test
    public void chooseBatteriesTesr() {
        Car car = new Car();
        Assertions.assertEquals("rechargable", car.chooseBattery("rechargable"));
    }
    @Test
    public void chooseRemoteControl() {
        Car car = new Car();
        Assertions.assertEquals("simple", car.chooseRemoteControl("simple"));
    }
    @Test
    public void seeBatteryPercentage() {
        Car car = new Car();
        Assertions.assertEquals(0.87, car.seeBatteryPercentage(0.87));
    }
    @Test
    public void moveCarTest() {
        Car car = new Car();
        Assertions.assertEquals("Move forward for 10 meters",car.move("forward", 10));
        Assertions.assertEquals("Move backwards for 50 meters", car.move("backwards", 50));
    }

}