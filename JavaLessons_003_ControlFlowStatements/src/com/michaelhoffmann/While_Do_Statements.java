package com.michaelhoffmann;

public class While_Do_Statements {

    public static void main(String[] args) {
        int count1 = 1;
        int count2 = 1;
        int count3 = 1;
        while(count1 < 7){
            System.out.println("Count value is " + count1);
            count1++;
        }

        for(count2 =1; count2<7; count2++){
            System.out.println("Count value with <for> is " + count2);
        }

        while(true){ //used for infinite loops
            if (count3 == 10){
                break; //normal use to end an infinite loop
            }
            System.out.println("count value with <infinite while loop> is " + count3);
            count3++;


        }

        int number = 4;
        int finishNumber =8;
        int evenNumberCount =0;

        while (number <= finishNumber){
            number++;
            if(!isEvenNumber(number)){
                evenNumberCount++;
                continue;
            }
            System.out.println("Even number" + number);
            if(evenNumberCount == 5) {
                System.out.println(evenNumberCount);
                break;
            }else System.out.println(evenNumberCount);

        }






    }

    public static boolean isEvenNumber(int number){
        if((number%2) == 0) return true;
        else return false;
    }


}
