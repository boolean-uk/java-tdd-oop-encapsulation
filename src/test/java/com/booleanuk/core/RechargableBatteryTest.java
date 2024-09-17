package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RechargableBatteryTest {
    @Test
    void rechargeShouldBe100() {
        RechargableBattery battery = new RechargableBattery();

        battery.consumeEnergy(100);
        Assertions.assertEquals(0, battery.getEnergy());

        battery.recharge();
        Assertions.assertEquals(100, battery.getEnergy());
    }
}
