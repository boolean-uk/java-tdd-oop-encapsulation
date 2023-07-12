package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testCarCreation() {
        Car car = new Car();

        Assertions.assertTrue(car instanceof Car);
    }

}
