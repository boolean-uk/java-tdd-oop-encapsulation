package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoteControlledCarTest {

    @Test
    public void setColor() {
        RemoteControlledCar car = new RemoteControlledCar();
        String newColor = "blue";

        assertEquals("red", car.color);

        String result = car.setColor(newColor);

        assertEquals("Changed car color to: " + newColor, result);
        assertEquals("blue", car.color);

    }
}
