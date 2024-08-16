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
        Assertions.assertEquals(100, car.batteryPercentage);
    }

    @Test
    public void testMoveCarForward() {
        Car car = new Car("Green", "rechargeable");
        Assertions.assertTrue(car.moveCarForward(10));
        Assertions.assertEquals(95, car.batteryPercentage);
        Car car2 = new Car("Red", "rechargeable");
        Assertions.assertTrue(car2.moveCarForward(1));
        Assertions.assertEquals(99, car2.batteryPercentage);
        Assertions.assertFalse(car2.moveCarForward(0));
    }

    @Test
    public void testMoveCarBackwards() {
        Car car = new Car("Green", "rechargeable");
        Assertions.assertTrue(car.moveCarBackwards(10));
        Assertions.assertEquals(95, car.batteryPercentage);
        Car car2 = new Car("Red", "rechargeable");
        Assertions.assertTrue(car2.moveCarBackwards(1));
        Assertions.assertEquals(99, car2.batteryPercentage);
        Assertions.assertFalse(car2.moveCarBackwards(0));
    }

}
