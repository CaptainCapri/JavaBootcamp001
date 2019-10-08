package com.HoffmannMichael;

public class Car {

  private int doors;
  private int wheels;
  private String model;
  private String engine;
  private String colour;

  public void setModel(String model) {
    String validModel = model.toLowerCase();
    if (validModel.equals("v8interceptor") || validModel.equals("ibiza")) {
      this.model = model;
    } else {
      this.model = "Unknown";
    }
  }

  public String getModel(){
    return this.model;
  }



}
