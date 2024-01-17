package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.*;

public class CarTest {
    Battery battery1;
    Battery battery2;
    Car car;

    @BeforeEach
    public void setup() {
        battery1 = new Battery(4600, false, 4600);
        battery2 = new Battery(6800, true, 3569);
        car = new Car(Color.CYAN, battery1, false);
    }

    // I want to be able to decide on the colour of the car.
    @Test
    public void canDecideTheColorOfTheCar() {
        Assertions.assertNotEquals(Color.BLUE, car.getColor());
        car.setColor(Color.BLUE);
        Assertions.assertEquals(Color.BLUE, car.getColor());
    }

    // I want to be able to choose between rechargable and disposable batteries.
    @Test
    public void canSwapBattery() {
        Assertions.assertEquals(battery1, car.getBattery());
        car.setBattery(battery2);
        Assertions.assertEquals(battery2, car.getBattery());
    }

    // I want to choose between a simple and an advanced remote control.
    @Test
    public void canToggleControls() {
        Assertions.assertFalse(car.isAdvancedControl());
        car.setAdvancedControl(true);
        Assertions.assertTrue(car.isAdvancedControl());
    }

    // I want to be able to see the battery percentage remaining.
    @Test
    public void canGetBatteryPercentage() {
        Assertions.assertEquals(100.00, car.getBattery().getPercentage());
        car.setBattery(battery2);
        Assertions.assertEquals(52.49, (double) (Math.round(car.getBattery().getPercentage() * 100)) / 100);
    }
}
