package com.company;

public class Main {

    public static void main(String[] args) {

        // int has a width of 32
        int myValue = 10000;
        int myMinValue= -2_147_483_648;
        int myMaxValue= 2_147_483_647;

        //byte has a width of 8
        byte myByteValue = -128;
        byte myNewByteValue = (byte) (myByteValue/2);
        System.out.println("myNewByteValue =" + myNewByteValue);

        //short has a width of 16
        short myShortValue = 3276;
        short myNewShortValue = (short) (myByteValue / 2); //Typecasting, normally Java converts to Int. With typecasting transform to other Datatypes

        // long has a width of 64
        long myLongValue = 9_223_372_036_854_775_807L;
        System.out.println(myLongValue);


        byte testByte = 2;
        short testShort = 3;
        int testInt = 5;
        long testLong = 50000L + (10L*(testShort + testByte + testInt));
        short testShort = (short) (1000 + 10*(testByte + testInt + testShort));
        System.out.println(testLong);

    }
}
