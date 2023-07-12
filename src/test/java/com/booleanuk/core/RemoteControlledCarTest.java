package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemoteControlledCarTest {

    @Test
    public void setColorTest() {
        RemoteControlledCar car = new RemoteControlledCar();
        String newColor = "blue";

        assertEquals("red", car.color);

        String result = car.setColor(newColor);

        assertEquals("Changed color to: " + newColor, result);
        assertEquals("blue", car.color);
    }

    @Test
    public void setRemoteControlTest() {
        RemoteControlledCar car = new RemoteControlledCar();
        String newRemoteControl = "advanced";

        assertEquals("simple", car.remoteControl);

        String result = car.setRemoteControl(newRemoteControl);

        assertEquals("Changed remote control to: " + newRemoteControl, result);
        assertEquals("advanced", car.remoteControl);
    }

    @Test
    public void moveForwardTest() {
        RemoteControlledCar car = new RemoteControlledCar();
        double distance = 20.45d;

        String result = car.moveForward(distance);

        assertEquals("Moving forward for: " + distance + "m", result);
    }
}
