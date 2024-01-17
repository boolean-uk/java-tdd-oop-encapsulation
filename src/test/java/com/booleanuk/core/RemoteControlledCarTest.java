package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {

    //User Story 1
    @Test
    public void testTeturnCarColor() {
        RemoteControlledCar remoteControlledCar = new RemoteControlledCar();

        String result = remoteControlledCar.chooseCarColor("Blue");

        Assertions.assertEquals("Chosen car color: " + "Blue.", result);
    }
}
