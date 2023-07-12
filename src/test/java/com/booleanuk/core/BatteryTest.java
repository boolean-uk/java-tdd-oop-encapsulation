package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class BatteryTest {
    Battery battery;

    @BeforeEach
    public void setup() {
        battery = new Battery("rechargable", 88);
    }
    @Test
    public void BatteryGetersAndSettersTest() {

        Assertions.assertEquals("rechargable", battery.getType());
        Assertions.assertEquals(88, battery.getPercentage());

        battery.setType("disposable");
        battery.setPercentage(44);

        Assertions.assertEquals("disposable", battery.getType());
        Assertions.assertEquals(44, battery.getPercentage());
    }
}
