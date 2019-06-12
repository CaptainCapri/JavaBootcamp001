package com.michaelhoffmann;

public class Car {


    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String colour;


    //this is a setter
    public void setModel(String model){
        String validModel = model.toLowerCase();
        if(validModel.equals("gt falcon") || validModel.equals("pursuit special")) {
            this.model = model;
        } else {
            this.model = "Unknown";

        }
    }


    //this is a getter
    public String getModel(){
        return this.model;
    }

}
