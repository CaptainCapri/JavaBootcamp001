package com.michaelhoffmann;

public class Digit_Sum_Challenge {
    public static void main(String[] args) {

        System.out.println(sumDigits(12099078));

    }
/*
    public static int sumDigitshudred(int number){
        if(number<10)return -1;
        else{
            int oneDigit = number % 10;
            int tenDigit = (number/10)%10;
            int hunDigit = number / 100;
            System.out.println("one: " + oneDigit + " ten: " + tenDigit + " hun: " + hunDigit);
            int digitSum = hunDigit + tenDigit + oneDigit;
            return digitSum;
        }
    }
 */
    public static int sumDigits(int number){
        if(number<10)return -1;
        else{
            int sum = 0;
            while(number>0){
                sum += number % 10;
                number /=  10;
                //System.out.println(number);

            }
            return sum;
        }


    }


}
