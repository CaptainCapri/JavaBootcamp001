package com.HoffmannMichael;

public class Jeep extends Car {

    private boolean toolBox;

    public Jeep(String color, double weight, int speed, String name, int wheels, int gears, int actualGear, int motors, boolean toolBox) {
        super(color, weight, speed, name, wheels, gears, actualGear, motors);
        this.toolBox = toolBox;
    }

    public Jeep(String name, int wheels, int gears, int actualGear, int motors, boolean toolBox) {
        super(name, wheels, gears, actualGear, motors);
        this.toolBox = toolBox;
    }

    public void allRad(){
        System.out.println("Jeep.allRad called");
        super.move();
    }






}
