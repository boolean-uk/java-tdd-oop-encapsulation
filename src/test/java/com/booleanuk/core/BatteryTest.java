package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BatteryTest {
    @Test
    public void shouldDefineBothTypesCorrectlyAndBeFull() {
        Battery battery = new Battery(true);
        Assertions.assertTrue(battery.getType());
        Assertions.assertEquals(100, battery.getPercentage());
        Battery battery1 = new Battery(false);
        Assertions.assertFalse(battery1.getType());
        Assertions.assertEquals(100, battery1.getPercentage());
    }
}
