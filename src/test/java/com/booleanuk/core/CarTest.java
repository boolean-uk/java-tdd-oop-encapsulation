package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car;

    public CarTest() {
        Battery battery = new Battery("rechargable", 50);
        RemoteControl remoteControl = new RemoteControl("advanced");
        this.car = new Car("red", battery, remoteControl );
    }

    @Test
    public void getBatteryPercentageTest() {
        Assertions.assertEquals(50, car.getBatteryPercentage());
        Assertions.assertNotEquals(70, car.getBatteryPercentage());
    }

    @Test
    public void moveForwardTest() {
        Assertions.assertEquals(0, car.getDistance());
        car.moveForward(40);
        Assertions.assertEquals(40,car.getDistance());
    }
}
