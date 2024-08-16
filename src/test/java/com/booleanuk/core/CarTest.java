package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    Car car = new Car("red", false, true);

    @Test
    public void testMove(){
        Assertions.assertEquals(5, car.move(5));
    }

    @Test
    public void testMoveNoParameter(){
        Assertions.assertTrue(car.move());
    }

    @Test
    public void testStop(){
        Assertions.assertTrue(car.move());
        Assertions.assertFalse(car.stop());
    }

    @Test
    public void testTurn(){
        Assertions.assertEquals("vertical", car.turn(""));
        Assertions.assertEquals("right", car.turn("right"));
        Assertions.assertEquals("left", car.turn("left"));
    }
}
