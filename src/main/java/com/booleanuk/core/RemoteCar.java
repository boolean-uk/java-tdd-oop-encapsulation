package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RemoteCar {
    public HashMap<String, String> remoteCar = new HashMap<>();

    public RemoteCar(){
        this.remoteCar.put("Colour", "null");
        this.remoteCar.put("Steering","null");
        this.remoteCar.put("Mileage","null");
        this.remoteCar.put("Battery type","null");
        this.remoteCar.put("Battery percentage","null");
    }

    public String[] carStatus(){
        ArrayList<String> keyList = new ArrayList<>();
        String [] attributes = new String[remoteCar.size()];
        for (Map.Entry<String, String> entry : remoteCar.entrySet()){
            keyList.add(entry.getKey());
        }
        for (int i = 0; i < keyList.size(); i++){
            attributes[i] = keyList.get(i) + ": " +remoteCar.get(keyList.get(i));
        }
        Arrays.sort(attributes);
        return attributes;
    }

    public String changeColour(String colour){
        remoteCar.put("Colour", colour);
        return "Colour changed to " + colour;
    }

    public String addSteering(boolean advanced){
        if (advanced){
            remoteCar.put("Steering", "advanced");
            return "Advanced steering activated";
        }else {
            remoteCar.put("Steering", "simple");
        }
        return "Simple steering activated";
    }

}
