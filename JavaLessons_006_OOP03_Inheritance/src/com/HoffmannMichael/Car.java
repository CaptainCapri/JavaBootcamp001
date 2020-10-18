package com.HoffmannMichael;

public class Car extends Vehicle {

    private String name;
    private int wheels;
    private int gears;
    private int actualGear;
    private int motors;

    public Car(String color, double weight, int speed, String name, int wheels, int gears, int actualGear, int motors) {
        super(color, weight, speed);
        this.name = name;
        this.wheels = wheels;
        this.gears = gears;
        this.actualGear = actualGear;
        this.motors = motors;
    }

    public Car(String name, int wheels, int gears, int actualGear, int motors) {
        this.name = name;
        this.wheels = wheels;
        this.gears = gears;
        this.actualGear = actualGear;
        this.motors = motors;
    }

    public void handSteering(){
        System.out.println("Car.handSteering called");
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public int getGears() {
        return gears;
    }

    public int getActualGear() {
        return actualGear;
    }

    public int getMotors() {
        return motors;
    }

    public int changingGears(int gear){
        if ((gear > this.gears) || (gear < 0) ) System.out.println("KRRRRKRKRRKKRKR wrong Gear");
        else this.actualGear = gear;
        return this.actualGear;

    }

}
