package com.michaelhoffmann;

public class Exercise_003_LeapYear {

    public static void main(String[] args) {

        System.out.println("this is a class");

        boolean b = isLeapYear(-1200);
        System.out.println(b);

    }

    public static boolean isLeapYear(int year){

        int leap4 = year % 4;
        int leap100 = year % 100;
        int leap400 = year % 400;


        if((year < 1) || (year > 9999)){
            return false;
        }else if((leap4 == 0 && leap100 != 0)){
            return true;

        }else if (leap400 == 0){
            return true;

        }else{
            return false;
        }


    }
}
