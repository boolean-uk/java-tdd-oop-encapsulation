package com.booleanuk.core;

public class RemoteControl {
    private String type;

    public RemoteControl(String type){
        this.type = type;
    }

    public String getRCType(){
        return this.type;
    }
}
