package Exercises;

import java.util.Scanner;

public class Challenge_MinimumAndMaximum {

    public static void main(String[] args) {

        int max = 0;
        int min = 0;
        boolean first = true;
        Scanner scanner = new Scanner(System.in);

        while (true){

            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                int usernumber = scanner.nextInt();
                if (first){
                    min = usernumber;
                    max = usernumber;
                    first = false;
                }
                if (usernumber>max) max = usernumber;
                if (usernumber<min) min = usernumber;


            }else break;

            scanner.nextLine();
        }
        System.out.println("Max is " + max + ". Min is " + min + ".");

    }

}
