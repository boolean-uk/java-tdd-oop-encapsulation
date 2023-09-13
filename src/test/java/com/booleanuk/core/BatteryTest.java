package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BatteryTest {

    @Test
    public void setBattery() {
        Battery battery = new Battery();
        String battery1 = "";
        String battery2 = "rechargeable";
        String battery3 = "disposable";
        String battery4 = "dhkjfd";

        Assertions.assertFalse(battery.setBattery(battery1));
        Assertions.assertFalse(battery.setBattery(battery4));
        Assertions.assertTrue(battery.setBattery(battery2));
        Assertions.assertTrue(battery.setBattery(battery3));
    }
}
