package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void setColour() {
        Car car = new Car();
        String colour1 = "";
        String colour2 = "red";

        Assertions.assertFalse(car.setColour(colour1));
        Assertions.assertTrue(car.setColour(colour2));
    }

    @Test
    public void showBatteryPercentage() {
        Car car = new Car();

        Assertions.assertEquals(21, car.showBatteryPercentage(69.5));
        Assertions.assertNotEquals(56, car.showBatteryPercentage(24.7));
    }

    @Test
    public void moveCar() {
        Car car = new Car();

        String direction1 = "";
        String direction2 = "forward";
        String direction3 = "backward";
        String direction4 = "dhkjfd";

        double distance1 = 0;
        double distance2 = 2.7;
        double distance3 = -4;

        Assertions.assertFalse(car.moveCar(distance1, direction1));
        Assertions.assertFalse(car.moveCar(distance2, direction4));
        Assertions.assertFalse(car.moveCar(distance1, direction2));
        Assertions.assertTrue(car.moveCar(distance2, direction2));
        Assertions.assertTrue(car.moveCar(distance2, direction3));
        Assertions.assertFalse(car.moveCar(distance3, direction2));
    }

    @Test
    public void stopCar() {
        Car car = new Car();

        Assertions.assertFalse(car.stopCar());

        car.moveCar(45, "forward");
        Assertions.assertTrue(car.stopCar());

        car.moveCar(46, "backward");
        Assertions.assertFalse(car.stopCar());
    }

    @Test
    public void turnCar() {
        Car car = new Car();

        Assertions.assertTrue(car.turnCar("left"));
        Assertions.assertTrue(car.turnCar("right"));
        Assertions.assertFalse(car.turnCar(""));
        Assertions.assertFalse(car.turnCar("dffdc"));
    }

    @Test
    public void replaceBattery() {
        Car car = new Car();

        Assertions.assertFalse(car.replaceBattery(""));
        Assertions.assertTrue(car.replaceBattery("something"));
        Assertions.assertTrue(car.replaceBattery("regular"));
    }
}
