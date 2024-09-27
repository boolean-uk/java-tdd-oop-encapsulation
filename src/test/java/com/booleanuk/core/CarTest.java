package com.booleanuk.core;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CarTest {

    Car car;


    @BeforeEach
    void prepare(){
        car = new Car("red",new Battery(BatteryType.rechargable,100),ControlType.simple);
    }



    @Test
     void ShouldChangeCarColor(){

        //given
        car.changeColor("Blue");
        //then
        assertEquals("Blue",car.getColor());

    }

    @Test
    void shouldReturnBatteryTypeDisposable(){
        //given
        car.choseBattery(BatteryType.disposable);
        //then
        assertEquals(BatteryType.disposable,car.getBattery().batteryType);

    }


    @Test
    void choosRemoteOrAdvanced(){
        //given
        car.choseControl(ControlType.simple);
        //then
        assertEquals(ControlType.simple,car.getControlType());
    }

    @Test
    void ShouldReturnBatteryPercentage(){
        //when
        int percentage = car.getBatteryPercentage();

        //then
        assertEquals(100,car.getBattery().percent);
    }

    @Test
     void shouldMoveCarForward10Miles(){
        //when
        car.moveForward(10);

        assertEquals(110,car.getTraveledDistance());
    }

    @Test
    void shouldMoveCarBackward10Miles(){
        //when
        car.moveBackward(10);

        assertEquals(90,car.getTraveledDistance());
    }

}
