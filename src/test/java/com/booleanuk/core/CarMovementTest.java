package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarMovementTest {

    @Test
    public void testMoveForward() {
        Car car1 = new Car("red", true, 5);
        CarMovement carMovement = new CarMovement(car1);

        //Successful test
        Assertions.assertTrue(carMovement.moveForward());

        //Failure test
        Assertions.assertFalse(carMovement.moveForward());
    }
}
