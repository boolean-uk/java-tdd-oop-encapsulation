package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarBatteryTest {

    //User Story 2
    @Test
    public void testChooseCarBattery() {
        RemoteControlledCarBattery remoteControlledCarBattery = new RemoteControlledCarBattery();

        String result = remoteControlledCarBattery.chooseCarBattery("Rechargeable");

        Assertions.assertEquals("Chosen car battery: " + "Rechargeable.", result);
    }

    //User Story 4
    @Test
    public void testRemainingBatteryPercentage() {
        RemoteControlledCarBattery remoteControlledCarBattery = new RemoteControlledCarBattery();

        String result = remoteControlledCarBattery.showBatteryPercentage(70);

        Assertions.assertEquals("Your battery is at: 30%", result);
    }

    @Test
    public void testReplaceCarBattery() {
        RemoteControlledCarBattery remoteControlledCarBattery = new RemoteControlledCarBattery();

        String result = remoteControlledCarBattery.replaceCarBattery("Disposable");

        Assertions.assertEquals("New car battery: disposable", result);
    }
}
