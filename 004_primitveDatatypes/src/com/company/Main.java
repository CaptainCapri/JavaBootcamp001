package com.company;

public class Main {

    public static void main(String[] args) {
         char myChar01 = '\u00A9';
        System.out.println("Unicode output is = " + myChar01);

        boolean myBool = true;

        System.out.println("I am so " + myBool);

        char myChar02 = '\u00AE';
        System.out.println("Unicode output is = " + myChar02);

        String myString = "This is a string";
        System.out.println(myString);
        myString = myString + ", but wait, there's more!";
        System.out.println("What is it? " + myString);
        myString = myString + " \u00A9 2017";
        System.out.println(myString);

        String numberString01 = "250.55";
        numberString01 = numberString01 + "49.55";
        System.out.println("The result is" + numberString01);

        String lastString = "10";
        int myInt01 = 50;
        lastString = lastString + myInt01;
        System.out.println("LAstString is equal to " + lastString);
        double doubleNumber = 120.47;
        lastString = lastString + doubleNumber;
        System.out.println("LastString value: " +lastString);





    }
}
