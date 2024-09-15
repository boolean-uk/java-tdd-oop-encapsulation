package com.booleanuk.core;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CarTest {
    @Test
    public void moveTest() {
        Car car = new Car();
        assertEquals("Car moved forward by 10km", car.move('f', 10));
        assertEquals("Car moved backwards by 5km", car.move('b', 5));
        assertEquals("Car moved forward by 5km", car.move('f', 30));
        assertEquals("Car is out of fuel", car.move('f', 20));
    }

    @Test
    public void showBatteryTest() {
        Car car = new Car();

        assertEquals("Battery:  100%", car.showBatteryLevel());
        car.move('f', 5);
        assertEquals("Battery:  75%", car.showBatteryLevel());
        car.move('f', 10);
        assertEquals("Battery:  25%", car.showBatteryLevel());
        car.move('f', 30);
        assertEquals("Battery:  0%", car.showBatteryLevel());
    }

    @Test
    public void changeBattery() {
        Car car1 = new Car(true);
        Car car2 = new Car(false);

        assertEquals("Recharged the battery", car1.changeBattery());
        assertEquals("Changed the battery", car2.changeBattery());
    }
}
