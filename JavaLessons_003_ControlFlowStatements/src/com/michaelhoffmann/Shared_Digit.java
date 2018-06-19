package com.michaelhoffmann;

public class Shared_Digit {
    public static void main(String[] args) {

        System.out.println(hasSharedDigit(153, 872));
        
    }

    public static boolean hasSharedDigit(int number1, int number2){
        if(number1<10 || number2<10||number1>99 || number2> 99) return false;
        int compareDigit1 = -1;
        int compareDigit2 = -1;
        int processedNumber1 = number1;
        int processedNumber2 = number2;
        while(processedNumber1!=0){
            compareDigit1 = processedNumber1 % 10;
            processedNumber1 = processedNumber1 / 10;
            System.out.println("compareDigit1" + compareDigit1);
            processedNumber2 = number2;
            while (processedNumber2 != 0) {
                compareDigit2 = processedNumber2 %10;
                processedNumber2 = processedNumber2/10;
                System.out.println("compareDigit2" + compareDigit2);
                if(compareDigit1 == compareDigit2) return true;

            }

        }return false;



    }

}
