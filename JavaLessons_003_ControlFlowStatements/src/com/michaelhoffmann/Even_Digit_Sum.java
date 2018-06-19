package com.michaelhoffmann;

public class Even_Digit_Sum {
    public static void main(String[] args) {
        System.out.println(getEvenDigitSum(6688));
    }

    public static int getEvenDigitSum(int number){
        if(number<0)return-1;
        else{
            int sum = 0;
            int digit = 0;
            while(number>0){
                digit = number % 10;
                if(digit % 2 != 0) digit = 0;
                //System.out.println(digit);
                sum += digit;
                number /=  10;
                //System.out.println(number);

            }
                return sum;


        }



    }

}

