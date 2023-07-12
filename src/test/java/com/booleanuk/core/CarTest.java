package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void moveTest() {
        Car car = new Car();
        assertEquals("Car moved forward by 10km", car.move("f", 10));
        assertEquals("Car moved backwards by 5km", car.move("b", 5));
        assertEquals("Car run out of battery", car.move("f", 30));
    }
}
