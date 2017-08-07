package com.company;

public class Main {

    public static void main(String[] args) {

        //width of int = 32 (4bytes)
        int i1 = 5 / 3;

        //width of float = 32 (4bytes)
        float f1 = 5.5f /3f;

        //width of double = 64 (8bytes)
        double d1 = 5.5d/3d;



        System.out.println(i1 + d1 + f1 );
        System.out.println("int = " +i1);
        System.out.println("double = " +d1 );
        System.out.println("float = " +f1 );
        // write your code here

        //pounds into kilograms
        double pounds = 200d;
        double modificator = 0.4535923d;
        double poundsInKilograms = pounds * modificator;

        System.out.println("your amount of pounds is" +  pounds * modificator + "kg");

        double pi = 3.141_597_2;
        //is the same as: unterstriche in zahlen sind zur übersicht
        double pi = 3.1415972;

    }
}
