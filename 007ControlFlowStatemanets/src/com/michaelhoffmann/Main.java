package com.michaelhoffmann;

public class Main {

    public static void main(String[] args) {
        int value = 1;
        if(value == 1){
            System.out.println("Value was 1");
        }else if (value == 2){
            System.out.println("Value was 2");
        } else {
            System.out.println("Was not 1 or 2");
        }

        int switchValue = 1;
        switch(switchValue) {
            case 1:
                System.out.println("Value was 1");
                break;
            case 2:
                System.out.println("Value was 2");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("achually it was a " + switchValue);
                break;
            default:
                System.out.println("Was not 1,2,3,4 or 5");
                break;
        }

        char alpha = 'C';

        switch(alpha){
            case 'A': case 'B':case 'C':case 'D':case 'E':case 'F':
                System.out.println(alpha + " was part of the alphabet A-F");
                break;
            default:
                System.out.println("Character was not found in the Alphabet A-F:" + alpha);
                break;

        }

        String month = "jaNuary";
        switch(month.toLowerCase()){
            case "january":
                System.out.println("Jan");
                break;
            case "june":
                System.out.println("Jun");
            default:
                System.out.println("Not sure");
        }



    }
}
