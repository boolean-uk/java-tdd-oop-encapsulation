package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void getCarTest(){
        Car car = new Car("Yellow", false, true);
        Assertions.assertEquals("Yellow", car.getColor());
        Assertions.assertFalse(car.getBattery().getBattery());
        Assertions.assertTrue(car.getControl());
    }
}
