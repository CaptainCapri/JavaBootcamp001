package com.michaelhoffmann;



public class Exercise_EvenDigitSum {
    public static void main(String[] args) {

        System.out.println(getEvenDigitSum(123456));

    }


    public static int getEvenDigitSum(int number){
        if (number < 0) return -1;

        int result = 0;

        while (number > 0) {
            int i = number % 10;

            number = number / 10;

            if ((i % 2) == 0) result = result + i;

            //System.out.println("result: " +  result + " i: " + i + " number: " + number);

        }

        return result;

    }


}



