package com.michaelhoffmann;

public class Switch {

    public static void main(String[] args) {

        int value = 1;
        if(value == 1){
            System.out.println("Value is 1");
        }else if(value == 2){
            System.out.println("Value is 2");
        }else{
            System.out.println("Value is neither 1 nor 2");
        }

        int switchValue = 2;

        switch(switchValue){
            case 1:
                System.out.println("Value is 1");
                break;
            case 2:
                System.out.println("Value is 2");
                break;
            case 3:
                System.out.println("Value is 3");
                break;
            case 4: case 5: case 6:
                System.out.println("Value is 4 or 5 or 6");
                System.out.println("actually it was a" + switchValue);
                break;
            default:
                System.out.println("Value was neither 1, 2 or 3");
                break;


        }

        char switchChar = 'Z';

        switch(switchChar){
            case 'A': case 'B': case 'C': case 'D': case 'E':
                System.out.println("found A, B, C, D or E");
                System.out.println(switchChar + " was found");
                break;
            default:
                System.out.println("Character A B C D E not found");
                break;

        }

        String month = "JuNe";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
                break;
            default:
                System.out.println("Not a month");
                break;
        }



    }




}
