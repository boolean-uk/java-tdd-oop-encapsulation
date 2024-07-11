package com.booleanuk.core;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class testRemoteControlledCar {
    @Test
    public void testMoveCar(){
        RemoteControlledCar car = new RemoteControlledCar();
        car.moveCar(5.0, 5.0 );
        Assertions.assertEquals(5.0, car.currentYCoord);
        Assertions.assertEquals(5.0, car.currentXCoord);
    }
    @Test
    public void testSwitchRemoteType(){
        RemoteControlledCar car = new RemoteControlledCar();
        if(car.advancedRemote){
            car.switchRemoteType();
            Assertions.assertEquals(false, car.advancedRemote);
        }else{
            car.switchRemoteType();
            Assertions.assertEquals(false, car.advancedRemote);
        }
    }
    @Test
    public void testStopCar(){
        RemoteControlledCar car = new RemoteControlledCar();
        car.movingCar = true;
        car.stopCar();
        Assertions.assertEquals(false,car.movingCar);
    }
    @Test
    public void testChangeCarColour(){
        RemoteControlledCar car = new RemoteControlledCar();

        car.changeCarColour("Blue");
        Assertions.assertEquals("Blue",car.carColour);
    }

}
