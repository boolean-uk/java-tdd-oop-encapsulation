package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {




    @Test
     void ShouldChangeCarColor(){
        //when
        Car car = new Car("Red");
        //given
        car.changeColor("Blue");
        //then
        assertEquals("Blue",car.getColor());

    }
}
