package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testChangeColour(){
        Car car = new Car();
        Assertions.assertEquals("Colour changed to 'pink'", car.changeColour("pink"));
    }

    @Test
    public void testMoveForward(){
        Car car = new Car();
        Assertions.assertEquals("Car moved forward by 10", car.moveForward(10));
    }

    @Test
    public void testMoveBackward(){
        Car car = new Car();
        Assertions.assertEquals("Car moved backward by 10", car.moveBackward(10));
    }

    @Test
    public void testStopMoving(){
        Car car = new Car();
        Assertions.assertEquals(true, car.stopMoving());
    }

    @Test
    public void testTurnLeft(){
        Car car = new Car();
        Assertions.assertEquals(true, car.turnLeft());
    }

    @Test
    public void testTurnRight(){
        Car car = new Car();
        Assertions.assertEquals(true, car.turnRight());
    }
}
