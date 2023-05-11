package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BatteryTest {
    @Test
    void consumeEnergyShouldBe50() {
        Battery battery = new DisposableBattery();

        Assertions.assertEquals(100, battery.getEnergy());

        battery.consumeEnergy(50);

        Assertions.assertEquals(50, battery.getEnergy());
    }
}
