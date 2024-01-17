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


}
