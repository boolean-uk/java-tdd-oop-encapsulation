package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RCCarTest {

    @Test
    public void testChangeRCSettingToAdvance() {
        RCCar car = new RCCar("Yellow", "Simple", "Rechargable");

        Assertions.assertEquals("Advanced", car.changeRCSetting("Advanced"));
    }

    @Test
    public void testChangeRCSettingToSimple() {
        RCCar car = new RCCar("Yellow", "Advanced", "Rechargable");

        Assertions.assertEquals("Simple", car.changeRCSetting("Simple"));
    }

    @Test
    public void testCheckBatteryPercentage() {
        RCCar car = new RCCar("Yellow", "Simple", "Rechargable");

        Assertions.assertEquals(1.0, car.batteryPercentage);

        car.setBatteryPercentage(0.54);
        Assertions.assertEquals(0.54, car.batteryPercentage);
    }
}
