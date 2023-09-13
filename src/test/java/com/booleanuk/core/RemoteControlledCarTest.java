package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoteControlledCarTest {
    @Test
    public void shouldBeAbleToSetNewCar() {
        String colour = "red";
        boolean isRechargeable = false;
        boolean isAdvanced = true;
        RemoteControlledCar car = new RemoteControlledCar(colour, isRechargeable, isAdvanced);
        Assertions.assertEquals("red", car.colour);
        Assertions.assertFalse(car.battery.getType());
        Assertions.assertTrue(car.controllerIsAdvanced);
        Assertions.assertEquals(100, car.viewBatteryPercentage());
    }

    @Test
    public void shouldChangeBatteryType() {
        String colour = "blue";
        boolean isRechargeable = false;
        boolean isAdvanced = true;
        RemoteControlledCar car = new RemoteControlledCar(colour, isRechargeable, isAdvanced);
        Assertions.assertFalse(car.battery.getType());
        Battery battery = new Battery(true);
        car.setBattery(battery);
        Assertions.assertTrue(car.battery.getType());
    }
}
