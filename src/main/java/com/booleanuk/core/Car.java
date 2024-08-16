package com.booleanuk.core;

public class Car {
    Battery battery = new Battery();
    RemoteControl remoteControl = new RemoteControl();

    public String changeColour(String newColour){

        return "Test";
    }

    public String moveForward(Integer distance){

        return "Test";
    }

    public String moveBackward(Integer distance){

        return "Test";
    }

    public Boolean stopMoving(){

        return true;
    }

    public Boolean turnLeft(){

        return true;
    }

    public Boolean turnRight(){

        return true;
    }
}
