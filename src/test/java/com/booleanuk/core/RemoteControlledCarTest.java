package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
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

    @Test
    public void moveBackwardTest() {
        RemoteControlledCar car = new RemoteControlledCar();
        double distance = 20.45d;

        String result = car.moveBackward(distance);

        assertEquals("Moving backward for: " + distance + "m", result);
    }

    @Test
    public void stopTest(){
        RemoteControlledCar car = new RemoteControlledCar();
        Assertions.assertEquals("Car stopped", car.stop());
    }

    @Test
    public void turnTest(){
        RemoteControlledCar car = new RemoteControlledCar();
        Assertions.assertEquals("Turned left", car.turn("left"));
        Assertions.assertEquals("Turned right", car.turn("right"));
    }

    @Test
    public void replaceBatteryTest(){
        RemoteControlledCar car = new RemoteControlledCar();
        Battery battery = new Battery("disposable");
        Assertions.assertEquals("Battery replaced to: disposable battery with 100% remaining", car.replaceBattery(battery));
    }

    @Test
    public void checkPercentage(){
        Battery battery = new Battery("disposable",85);
        Assertions.assertEquals(85, battery.checkPercentageRemaining());
    }
}
