package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testAddTaskSuccessful() {
        Car car = new Car();
        Assertions.assertTrue(car.setColor("Black"));
        Assertions.assertFalse(car.setColor("\n\r\t"));
    }

}
