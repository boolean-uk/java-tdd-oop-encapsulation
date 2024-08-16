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

        Assertions.assertEquals("red", car.getColor());

        String newCarColor = "green";
        car.setColor(newCarColor);
        Assertions.assertEquals(newCarColor, car.getColor());
    }

    @Test
    public void ChooseBetweenBatteryTypesTest(){
        // I want to be able to choose between rechargable and disposable batteries.
        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        Assertions.assertEquals("disposable", car.getBattery().getBatteryType());


        Battery battery2 = new Battery("rechargable");
        RemoteControl remoteControl2 = new RemoteControl("simple");
        Car car2 = new Car("red", battery2, remoteControl2);

        Assertions.assertEquals("rechargable", car2.getBattery().getBatteryType());
    }

    @Test
    public void ChooseBetweenSimpleAndAdvancedRC(){
        // I want to choose between a simple and an advanced remote control.
        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        Assertions.assertEquals("simple", car.getRemoteControl().getRCType());

        Battery battery2 = new Battery("rechargable");
        RemoteControl remoteControl2 = new RemoteControl("advanced");
        Car car2 = new Car("red", battery2, remoteControl2);

        Assertions.assertEquals("rechargable", car2.getRemoteControl().getRCType());
    }
}
