package com.booleanuk.core;

import com.sun.source.util.TaskListener;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.awt.event.ContainerListener;
import java.util.List;

public class CarTests {

    @Test
    public void getRemainingPercentageTest() {
        Car car = new Car("red", Car.BatteryType.Disposable, Car.ControlType.Advanced);
        Assertions.assertEquals(100, car.getBatteryPercentage());
        car.move(10);
        car.move(-20);
        Assertions.assertEquals(97, car.getBatteryPercentage());
        car.changeBatteries(Car.BatteryType.Disposable);
        Assertions.assertEquals(100, car.getBatteryPercentage());
    }

    @Test
    public void moveTest() {
        Car car = new Car("red", Car.BatteryType.Disposable, Car.ControlType.Advanced);
        car.move(10);
        Assertions.assertEquals(10, car.getY());
        car.move(-20);
        Assertions.assertEquals(-10, car.getY());
    }

    @Test
    public void turnTest() {
        Car car = new Car("red", Car.BatteryType.Disposable, Car.ControlType.Advanced);
        car.move(10);
        car.turn(true);
        car.move(20);
        Assertions.assertEquals(-20, car.getX());
        car.turn(true);
        car.move(30);
        Assertions.assertEquals(-20, car.getY());
        car.turn(false);
        car.move(-40);
        Assertions.assertEquals(20, car.getX());
    }
}
