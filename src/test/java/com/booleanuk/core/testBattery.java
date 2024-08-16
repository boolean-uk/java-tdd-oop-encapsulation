package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testBattery {
    @Test
    public void testGetBatteryRemainingAsPercentage(){
        Battery battery = new Battery();
        Assertions.assertEquals("100%",battery.getBatteryRemainingAsPercentage());
    }

    @Test
    public void testSwitchBatteryType(){
    Battery battery = new Battery();
    battery.switchBatteryType();
        Assertions.assertEquals(true,battery.batteryRechargeable);
    }
}
