package com.michaelhoffmann;

public class Exercise_002 {

    public static void main(String[] args) {

        System.out.println("this is a class");

        bark(true,11);



    }

    public static boolean bark(boolean barking, int hourOfDay){

        if(hourOfDay <0 || hourOfDay >23){
            return false;
        }else {
            if (barking && (hourOfDay < 8 || hourOfDay > 22)) {
                return true;
            } else {
                return false;
            }
        }


    }


}
