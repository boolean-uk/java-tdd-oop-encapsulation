package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FullTest {
    @Test
    public void canChangeController() {
        Car car = new Car("blue", false, 0, 0, 100);
        Controller con1 = new Controller(false);
        Controller con2 = new Controller(true);
        Person p = new Person(car, con1);
        Assertions.assertNotEquals(con2, p.getController());
        p.setController(con2);
        Assertions.assertEquals(con2, p.getController());
    }

    @Test
    public void testGetBattery() {
        Controller con = new Controller(false);
        Car car = new Car("blue", false, 0, 0, 100)
        Assertions.assertEquals(100, con.seeBatteryPercentage(car));
    }

    @Test
    public void testMoveCar() {
        Car car = new Car("blue", false, 5, 0, 100);
        Controller con1 = new Controller(false);
        Assertions.assertEquals(0, car.getLocation());
        con1.moveCar(10);
        Assertions.assertEquals(50, car.getLocation());
    }
}
