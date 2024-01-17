package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarBatteryTest {

    @Test
    public void testChooseCarBattery() {
        RemoteControlledCarBattery remoteControlledCarBattery = new RemoteControlledCarBattery();

        String result = remoteControlledCarBattery.chooseCarBattery("Rechargeable");

        Assertions.assertEquals("Chosen car batter: " + "Rechargeable.", result);
    }
}
