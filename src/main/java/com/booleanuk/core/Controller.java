package com.booleanuk.core;

public class Controller {
    private String controllerType;

    public Controller(String controllerType) {
        this.controllerType = controllerType;
    }

    public String getControllerType() {
        return controllerType;
    }

    public void setControllerType(String controllerType) {
        this.controllerType = controllerType;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "controllerType='" + controllerType + '\'' +
                '}';
    }
}
