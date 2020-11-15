package com.HoffmannMichael;

class Car{
    private boolean engine;
    private int cylinders;
    private String name;
    private int wheels;
    private String special;

    public Car(int cylinders, String name) {
        this.engine = true;
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public String getSpecial() {
        return special;
    }

    public String startEngine(){
        return "Takataka, engine started()";
    }

    public String accelerate(){
        return "Vrooooom, accelerated()";
    }

    public String brake(){
        return "Quieetsch, braking()";
    }
}

class Delorean extends Car{
    public Delorean(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Delorean, engine started()";
    }

    @Override
    public String accelerate() {
        return "DeLorean, accelerated()";
    }

    @Override
    public String brake() {
        return "DeLorean, braking()";
    }
}



public class MainCar {

    public static void main(String[] args) {
        System.out.println("iugehwuiegfhwieugfhuwif");

        Car car1 = new Car(8, "RandomCar");
        System.out.println(car1.getName());
        System.out.println(car1.startEngine());
        System.out.println(car1.accelerate());
        System.out.println(car1.brake());


        Delorean car2 = new Delorean(8, "DeLorean");
        System.out.println(car2.getName());
        System.out.println(car2.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car2.brake());

    }

    static class V8Interceptor extends Car{
        public V8Interceptor(int cylinders, String name) {
            super(cylinders, name);
        }

        @Override
        public String startEngine() {
            return "V8Interceptor, engine started()";
        }

        @Override
        public String accelerate() {
            return "V8Interceptor, accelerated()";
        }

        @Override
        public String brake() {
            return "V8Interceptor, braking()";
        }
    }
}