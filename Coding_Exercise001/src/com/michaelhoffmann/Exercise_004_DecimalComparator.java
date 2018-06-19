package com.michaelhoffmann;

public class Exercise_004_DecimalComparator {

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);

    }

    public static boolean areEqualByThreeDecimalPlaces(double d1, double d2 ){

        int i1 = (int)(d1 * 1000);
        int i2 = (int)(d2 * 1000);
        if(i1 == i2){
            return true;
        }else return false;

    }


}
