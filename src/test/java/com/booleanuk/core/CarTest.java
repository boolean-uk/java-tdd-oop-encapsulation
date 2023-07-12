package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void pickColorTest(){
        Car car = new Car();
        car.pickColor("Green");
        Assertions.assertEquals("Green", car.color);
    }

    @Test
    public void chooseBatteryTest(){
        Car car = new Car();
        car.chooseBattery(Battery.DISPOSABLE);
        Assertions.assertEquals("The RECHARGABLE is choosen!", car.chooseBattery(Battery.RECHARGABLE));
    }
}
