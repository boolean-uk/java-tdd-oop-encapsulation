package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {

    //User Story 1
    @Test
    public void testReturnCarColor() {
        RemoteControlledCar remoteControlledCar = new RemoteControlledCar();

        String result = remoteControlledCar.chooseCarColor("Blue");

        Assertions.assertEquals("Chosen car color: " + "Blue.", result);
    }

    //User Story 3
    @Test
    public void testReturnRemoteControlType() {
        RemoteControlledCar remoteControlledCar = new RemoteControlledCar();

        String result = remoteControlledCar.chooseCarRemoteControl("Simple");

        Assertions.assertEquals("Chosen remote control type: " + "Simple.", result);
    }

    //User Story 5
    @Test
    public void testMoveCarBackwardOrForward() {
        RemoteControlledCar remoteControlledCar = new RemoteControlledCar();

        String result = remoteControlledCar.moveCarBackOrForth(100, "backwards");

        Assertions.assertEquals("Your car moved " +  "100" + "m" + " backwards.", result);
    }

    //User Story 6
    @Test
    public void testCarIsStopped() {
        RemoteControlledCar remoteControlledCar = new RemoteControlledCar();

        String result = remoteControlledCar.stopCar();

        Assertions.assertEquals("Stopped.", result);
    }

    //User Story 7
    @Test
    public void testMoveCarLeftOrRight() {
        RemoteControlledCar remoteControlledCar = new RemoteControlledCar();

        String result = remoteControlledCar.moveCarLeftOrRight("Left");

        Assertions.assertEquals("Car is moving " + "left.", result);
    }
}
