package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BatteryTest {
    private Battery battery;

    @BeforeEach
    public void setUp() {
        battery = new Battery("Duracell");
    }

    @Test
    public void testGetRemainingPercentageShouldReturn100() {
        // Execute
        int actual = battery.getRemainingPercentage();

        // Verify
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testDrainBatteryShouldReturn90() {
        // Execute
        battery.drainBattery(10);
        int actual = battery.getRemainingPercentage();

        // Verify
        int expected = 90;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void drainBatteryShouldThrowIllegalArgumentException() {
        // Execute and Verify
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            battery.drainBattery(101);
        });
    }
}
