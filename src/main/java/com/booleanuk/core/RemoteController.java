package com.booleanuk.core;

public class RemoteController {
    String type;

    public RemoteController(String type){
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
