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

}
