package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {


    @Test
    public void testCarMembers() {
        Car car = new Car("Blue","Rechargable","advanced");
        Assertions.assertEquals("Blue",car.colour);
        Assertions.assertEquals("Rechargable",car.batteries);
        Assertions.assertEquals("advanced",car.remotecontrol);
    }


    public String seeBattery() {
        Car car = new Car("Blue","Rechargable","advanced");
        seeBattery()
    }
}
