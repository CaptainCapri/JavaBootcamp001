package com.michaelhoffmann;

public class Exercise_AllFactors {
    public static void main(String[] args) {

        printFactors(-1);

    }



    public static void printFactors(int number){
        if(number<1) System.out.println("Invalid Value");
        else{int divisor1 = 0;
            while(divisor1!=number) {
                divisor1++;
                if (number % divisor1 == 0) System.out.println(divisor1);

            }
        }
    }

}
