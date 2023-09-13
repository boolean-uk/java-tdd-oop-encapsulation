package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RcCarTest {
    @Test
    public void CheckCarCostructor(){
        RcCar car = new RcCar("black",true,true);
        Assertions.assertEquals(car.getColour(),"black");
        Assertions.assertTrue(car.getAdvancedControl());
        Assertions.assertTrue(car.getBattery().getIsRechargeable());
        Assertions.assertEquals(car.getBattery().getPercentage(),100);
    }

    @Test
    public void CheckMovement(){
        RcCar car = new RcCar("black",true,true);
        Assertions.assertEquals(car.move("forward",5.2),"Car moved forward 5.2 meters.");
        Assertions.assertEquals(car.move("backwards",4.3),"Car moved backwards 4.3 meters.");
        Assertions.assertTrue(car.stop());
        Assertions.assertEquals(car.turn("right"),"car turned right.");
        Assertions.assertEquals(car.turn("left"),"car turned left.");
    }

    @Test
    public void CheckBatteryReplacement(){
        RcCar car = new RcCar("black",true,true);
        car.getBattery().setPercentage(50);
        Assertions.assertEquals(car.toString(),"colour: black\n" +
                "advanced control: true\n" +
                "battery\n" +
                " rechargeable: true\n" +
                " percentage: 50");
        Battery newBattery = new Battery(false,95);
        car.replaceBattery(newBattery);
        Assertions.assertEquals(car.toString(),"colour: black\n" +
                "advanced control: true\n" +
                "battery\n" +
                " rechargeable: false\n" +
                " percentage: 95");
    }

}
