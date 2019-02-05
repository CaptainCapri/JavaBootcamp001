package com.michaelhoffmann;

public class Parse_Values_from_a_String {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsSring= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);


        numberAsString += 1;
        number += 1;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }




}
