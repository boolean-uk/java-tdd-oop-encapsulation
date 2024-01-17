package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.rmi.server.RMIClassLoader;
import java.util.HashMap;

public class RemoteCarTest {
    @Test
    public void testRemoteCarAttributes(){
        RemoteCar newCar = new RemoteCar();
        HashMap<String,String> remoteCar = newCar.remoteCar;
        Assertions.assertArrayEquals(new String[]{"Battery percentage: null","Battery type: null",
                "Colour: null","Mileage: null","Steering: null"}, newCar.carStatus());
    }

    @Test
    public void testChangeColour(){
        RemoteCar newCar = new RemoteCar();
        Assertions.assertEquals("Colour changed to red", newCar.changeColour("red"));
        Assertions.assertEquals("red",newCar.remoteCar.get("Colour"));
        Assertions.assertArrayEquals(new String[]{"Battery percentage: null","Battery type: null",
                "Colour: red","Mileage: null","Steering: null"}, newCar.carStatus());
    }

    @Test
    public void testAddSteering(){
        RemoteCar newCar = new RemoteCar();
        Assertions.assertEquals("Advanced steering activated",
                newCar.addSteering(true));
    }

}
