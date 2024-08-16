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

        Assertions.assertEquals("advanced", car2.getRemoteControl().getRCType());
    }

    @Test
    public void SeeBatteryPercentageRemaining(){
        /*
        I want to be able to see the battery percentage remaining.
        Test demonstrates that a new battery has 100% battery, and that the percentage can be fetched.
         */

        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        Assertions.assertEquals(100, car.getBattery().getRemainingBatteryPercentage());
    }

    @Test
    public void testMoveForward(){
        /*
        I want to be able to move the car forward a specific distance.
        */

        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        String movement = car.moveForward(100);

        String expectedString = "Car moved forward 100 metres";

        Assertions.assertEquals(expectedString, movement);
    }

    @Test
    public void testMoveBackward(){
        /*
        I want to be able to move the car backward a specific distance.
        */

        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        String movement = car.moveBackward(100);

        String expectedString = "Car moved backward 100 metres";

        Assertions.assertEquals(expectedString, movement);
    }

    @Test
    public void stopTest(){
                /*
        I want to be able to move the car backward a specific distance.
        */

        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        String stop = car.stop();
        Assertions.assertEquals("Car has stopped.", stop);
    }

    @Test
    public void turnLeftTest(){
        /*
        I want to be able to turn the car left.
        */

        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        String turnLeft = car.turnLeft();
        Assertions.assertEquals("Turning left.", turnLeft);
    }

    @Test
    public void turnRighTest(){
        /*
        I want to be able to turn the car right.
        */

        Battery battery = new Battery("disposable");
        RemoteControl remoteControl = new RemoteControl("simple");
        Car car = new Car("red", battery, remoteControl);

        String turnRight = car.turnRight();
        Assertions.assertEquals("Turning right.", turnRight);
    }


}
