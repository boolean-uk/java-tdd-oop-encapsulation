package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BatteryTest {

    Battery battery;
    public BatteryTest() {
        this.battery = new Battery("rechargable", 50);
    }

    @Test
    public void getTypeTest() {
        Assertions.assertEquals("rechargable", battery.getType());
    }
}
