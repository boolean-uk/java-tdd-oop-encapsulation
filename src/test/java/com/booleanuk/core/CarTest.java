package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testReplaceBattery() {
        Car car1 = new Car("red", true, 5);
        Car car2 = new Car("blue", false, 70);


        //Successful test
        Assertions.assertTrue(car1.replaceBattery());

        //Failure test
        Assertions.assertFalse(car2.replaceBattery());
    }

}
