package com.booleanuk.core;

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
    public static void testGetRemainingPercentageShouldReturn100() {
        // Execute
        int actual = battery.getRemainingPercentage();

        // Verify
        int expected = 100;
        assertEquals(expected, actual);
    }
}
