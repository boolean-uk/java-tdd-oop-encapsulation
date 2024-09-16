package com.booleanuk.core;

import java.util.HashMap;

public class Car {
    String color;
    int carId=0;
    String batteryType;
    String batteryPer;

    HashMap<Integer, Car> car;
    public Car(){
        this.car = new HashMap<>();
    }

    public String chooseColor(String color){
        if (color.isEmpty()){
            return "Error Choose color";
        }
        else {
            return color;
        }
    }

//    Car aCar = new Car();
//    aCar.color=color;
//    aCar.carId=this.carId++;
//    aCar.batteryPer="100%";
//    aCar.batteryType="disposable";
//        car.put()
    public static void main(String[] args) {

    }
}
