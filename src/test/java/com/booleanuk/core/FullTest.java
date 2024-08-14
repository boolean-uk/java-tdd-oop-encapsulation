package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FullTest {
    @Test
    public void canChangeController() {
        Car car = new Car("blue", false, 0, 0);
        Controller con1 = new Controller(false, 100);
        Controller con2 = new Controller(true, 100);
        Person p = new Person(car, con);
        Assertions.assertNotEquals(con2, p.getController());
        p.setController(con2);
        Assertions.assertEquals(con2, p.getController());
    }
}
