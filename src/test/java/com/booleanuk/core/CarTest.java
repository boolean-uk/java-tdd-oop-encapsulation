package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testReplaceBattery() {
        Car car = new Car("red", true, 70);

        //Successful test
        Assertions.assertTrue(car.replaceBattery());

        //Failure test
        Assertions.assertFalse(car.replaceBattery());
    }

}
