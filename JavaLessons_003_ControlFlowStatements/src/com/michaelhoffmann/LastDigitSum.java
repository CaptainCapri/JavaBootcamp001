package com.michaelhoffmann;

public class LastDigitSum {
    public static void main(String[] args) {

    }

    public static int sumFirstAndLastDigit(int number){
        if(number<0)return -1;
        int lastDigit = number %10;
        while (number >= 10) number /= 10;
        int sum = number + lastDigit;
        return sum;




    }

}
