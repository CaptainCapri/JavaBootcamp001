package com.HoffmannMichael;

public class Vehicle {

    private String color;
    private double weight;
    private int speed;

    public Vehicle(String color, double weight, int speed) {
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public Vehicle() {
        this ("nothing", 0.0, 0);
    }

    public String getColor() {
        return color;
    }

    public double getWeight() {
        return weight;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void move(){
        System.out.println("Vehicle.move called. Speed is: " + this.speed);
    }
}
