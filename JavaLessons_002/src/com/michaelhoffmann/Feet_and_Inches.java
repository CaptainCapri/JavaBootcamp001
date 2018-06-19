package com.michaelhoffmann;

public class Feet_and_Inches {
    public static void main(String[] args) {

        int feet = calcFeetAndInchesToCentimeters(0,3);
        int inch = calcFeetAndInchesToCentimeters(8);

        System.out.println(feet);
        System.out.println(inch);


    }

    public static int calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet < 0 || inches < 0 || inches > 12) return -1;
        double d1 =(double)feet * 30.48;
        double d2 =(double)inches * 2.54;
        double d3 = d1 + d2;
        int i1 = (int)d3;
        return i1;

    }

    public static int calcFeetAndInchesToCentimeters(int inches){
        if(inches < 0 || inches > 12) return -1;
        double d2 =(double)inches * 2.54;
        int i1 = (int)d2;
        return i1;

    }


}
