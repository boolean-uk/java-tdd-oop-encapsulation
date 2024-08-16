package com.booleanuk.core;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {

    @Test
    public void testCreateACar() {
        Car car = new Car("Green", "rechargeable");
        Assertions.assertNotNull(car);
        Assertions.assertEquals("Green", car.color);
        Assertions.assertEquals("rechargeable", car.batteryType);
        Assertions.assertThrows(NullPointerException.class, () -> {
            new Car(null, "rechargeable");
        });

        Assertions.assertThrows(NullPointerException.class, () -> {
            new Car("Green", null);
        });
    }

    @Test
    public void testGetBatteryPercentage() {
        Car car = new Car("Green", "rechargeable");
        Assertions.assertEquals(100, car.batteryPercentage());
    }

}
