package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {

    @Test
    public void testTeturnCarColor() {
        RemoteControlledCar remoteControlledCar = new RemoteControlledCar();

        String result = remoteControlledCar.chooseCarColor("Blue");

        Assertions.assertEquals("New car color: " + "Blue.", result);
    }
}
