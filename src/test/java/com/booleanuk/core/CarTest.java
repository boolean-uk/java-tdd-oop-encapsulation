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

    @Test
    public void testSeeBatteryRechargable() {
        Car car = new Car("Blue","Rechargable","advanced");
        Assertions.assertEquals("The battery is rechargable",car.seeBattery());

    }

    @Test
    public void testSeeBatteryNotChargable() {
        Car car = new Car("Blue","Disposal","advanced");
        Assertions.assertEquals("The battery is not rechargable",car.seeBattery());

    }
}
