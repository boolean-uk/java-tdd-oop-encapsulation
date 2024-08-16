package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.rmi.Remote;

public class CarTest {
    @Test
    public void decideColorOfCar(){
        // I want to be able to decide on the colour of the car.
        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        Assertions.assertEquals("red", car.color);

        String newCarColor = "green";
        car.setColor(newCarColor);
        Assertions.assertEquals(newCarColor, car.color);
    }



}
