package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CarTest {
    @Test
    public void testCarColourChoice(){
        Car car = new Car();
        String resultat = car.chooseColor("red");
        Assertions.assertEquals("red", resultat);
    }
}
