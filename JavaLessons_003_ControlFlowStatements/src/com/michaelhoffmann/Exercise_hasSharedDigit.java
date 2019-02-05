package com.michaelhoffmann;

public class Exercise_hasSharedDigit {

    public static void main(String[] args) {

        System.out.println(hasSharedDigit(72, 73));

    }


    public static boolean hasSharedDigit(int i, int j){
        if ((i < 10) | (j < 10) | (i > 99) | (j > 99)) return false;

        int k;

        while (i > 0){
            int compare1 = i % 10;
            k = j;

            while (k > 0){

                int compare2 = k % 10;
                //System.out.println("c1: " + compare1 + " c2: " + compare2);

                if (compare1 == compare2) return true;
                else k = k / 10;

            }

            i = i / 10;
            //System.out.println(i);
        }

        return false;

    }



}
