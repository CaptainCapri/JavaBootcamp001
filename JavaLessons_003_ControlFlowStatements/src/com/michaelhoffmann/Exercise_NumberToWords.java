package com.michaelhoffmann;

import com.sun.org.apache.xpath.internal.SourceTree;

public class Exercise_NumberToWords {
    public static void main(String[] args) {

        numberToWords(10);
        System.out.println(getDigitCount(0));

    }

    public static void numberToWords(int number){
        if(number<1) System.out.println("Invalid Value");
        int digit = 0;
        int processedNumber1 = reverse(number);
        int numberDigits = getDigitCount(number);
        while(numberDigits>0){
            numberDigits--;
            digit = processedNumber1 % 10;
            processedNumber1 /=10;
            switch(digit){
                case 0: default:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }



    }

    public static int reverse(int number1){

        int reverse = 0;
        int processedNumber2 = number1;
        if(number1<0) processedNumber2 *= -1;
        while(processedNumber2>0){
            reverse *= 10;
            reverse += processedNumber2%10;
            processedNumber2 /=10;

        }
        if(number1<0) reverse *= -1;
        return reverse;
    }

    public static int getDigitCount (int number2){
        if (number2<0) return -1;
        if (number2==0) return 1;
        int digits = 0;
        while(number2>0){
            digits++;
            number2 /= 10;

        }
        System.out.println(digits);
        return digits;



    }



}
