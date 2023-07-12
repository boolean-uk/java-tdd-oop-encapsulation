package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

    public class RemoteCarTest {

        @Test
        void shouldChangeCarAndReturnBool() {
            RemoteCar car = new RemoteCar("rechargable", "green", "simple");

            boolean color1 = car.changeCar("green");
            Assertions.assertFalse(color1);

            boolean color2 = car.changeCar("blue");
            Assertions.assertTrue(color2);
        }

        @Test
        void shouldChooseBatteryAndReturnBool() {
            RemoteCar car = new RemoteCar("rechargable", "green", "simple");

            boolean battery1 = car.chooseBattery("error");
            Assertions.assertFalse(battery1);

            boolean battery2 = car.chooseBattery("disposable");
            Assertions.assertTrue(battery2);
        }

//    @Test
//    void shouldChangeControlAndReturnBool() {
//        RemoteCar car = new RemoteCar("rechargable", "green", "simple");
//
//        boolean control1 = car.changeControl("error");
//        Assertions.assertFalse(control1);
//
//        boolean control2 = car.changeControl("advanced");
//        Assertions.assertTrue(control2);
//    }
//
//    @Test
//    void shouldReturnBatteryCharge() {
//        RemoteCar car = new RemoteCar("rechargable", "green", "simple");
//
//        int charge = car.batteryCheck();
//        Assertions.assertEquals(100, charge);
//    }
//
//    @Test
//    void shouldReturnDirectionMessage() {
//        RemoteCar car = new RemoteCar("rechargable", "green", "simple");
//
//        String forward = car.moveCar("forward");
//        Assertions.assertEquals("The car is moving forward", forward);
//
//        String backwards = car.moveCar("backwards");
//        Assertions.assertEquals("The car is moving backwards", backwards);
//    }
//
//    @Test
//    void shouldReturnStopMessage() {
//        RemoteCar car = new RemoteCar("rechargable", "green", "simple");
//
//        String stop = car.stopCar();
//        Assertions.assertEquals("The car has been stopped", stop);
//    }
//
//    @Test
//    void shouldReturnTurnMessage() {
//        RemoteCar car = new RemoteCar("rechargable", "green", "simple");
//
//        String left = car.turnCar("left");
//        Assertions.assertEquals("The car is turning left", left);
//        String right = car.turnCar("right");
//        Assertions.assertEquals("The car is turning right", right);
//    }
//
//    @Test
//    void shouldChangeBatteryAndReturnStringMessage() {
//        RemoteCar car = new RemoteCar("rechargable", "green", "simple");
//
//        String disposable = car.changeBattery();
//        Assertions.assertEquals("The battery is disposable now", disposable);
//
//        RemoteCar car2 = new RemoteCar("disposable", "green", "simple");
//
//        String rechargable = car.changeBattery();
//        Assertions.assertEquals("The battery is rechargable now", rechargable);
//        }
    }


