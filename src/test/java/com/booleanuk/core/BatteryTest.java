package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BatteryTest {

    @Test
    public void testGetBatteryPercentage(){
        Car car = new Car();

        Assertions.assertEquals(100, car.battery.getBatteryPercentage());
    }

    @Test
    public void testReplaceBattery(){
        Car car = new Car();

        Assertions.assertEquals("Battery replaced with battery type: 'disposable'", car.battery.replaceBattery(false));
        Assertions.assertEquals("Battery replaced with battery type: 'rechargeable'", car.battery.replaceBattery(true));
    }

    @Test
    public void testChargeBattery(){
        Car car = new Car();

        Assertions.assertEquals("Battery fully charged.", car.battery.chargeBattery());
    }
}
