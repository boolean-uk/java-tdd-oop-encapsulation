package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {
    RemoteControlledCar remoteControlledCar;

    @BeforeEach
    public void setUp() {
        remoteControlledCar =
                new RemoteControlledCar("blue", "AA", "simple", 68, 23);
    }

    @Test
    public void setBatteryTest() {
        String oldBattery = remoteControlledCar.getBattery();
        String newBattery = remoteControlledCar.changeBattery("AAA");
        Assertions.assertEquals(oldBattery, newBattery);
    }

    @Test
    public void changeColourTest() {

    }

    @Test
    public void setRemoteControlTest() {

    }

    @Test
    public void moveForwardTest() {

    }

    @Test
    public void moveBackwardTest() {

    }

    @Test
    public void stopCarTest() {

    }

    @Test
    public void turnLeftTest() {

    }

    @Test
    public void turnRightTest() {

    }

    @Test
    public void replaceBatteryTest() {

    }
}
