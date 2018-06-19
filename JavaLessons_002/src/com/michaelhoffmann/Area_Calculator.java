package com.michaelhoffmann;

public class Area_Calculator {
    private static final double PI= 3.14159;

    public static void main(String[] args) {

        System.out.println(area(-1));
        System.out.println(area(-1,4.0));


    }

    public static double area(double radius){
        if(radius < 0) return -1.0;

        double area = PI * (radius * radius);

        return area;
    }

    public static double area(double length, double width){
        if(length < 0 || width < 0) return -1.0;

        double area = length * width;

        return area;

    }


}
