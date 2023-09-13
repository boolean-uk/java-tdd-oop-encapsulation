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
        Assertions.assertEquals("disposable",car.getBattery().getType());
        car.replaceBattery("rechargeable");
       Assertions.assertEquals("rechargeable",car.getBattery().getType());
    }
    @Test
    public void testSetControl() {
        Battery battery = new Battery("disposable");
        Car car = new Car("Red", battery, false);
        Assertions.assertFalse(car.hasAdvancedControl());
        car.setHasAdvancedControl(true);
        Assertions.assertTrue(car.hasAdvancedControl());
    }
   
}
