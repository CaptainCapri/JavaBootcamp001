package com.michaelhoffmann;

public class Last_Digit_Checker {
    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit(int number1, int number2, int number3){
        if(number1<10 || number2<10 || number3<10 || number1>1000 || number2>1000 || number3>1000) return false;
        int digit1 = number1 %10;
        int digit2 = number2 %10;
        int digit3 = number3 %10;
        if((digit1 == digit2) || (digit1 == digit3) || (digit2==digit3)) return true;
        else return false;

    }

}
