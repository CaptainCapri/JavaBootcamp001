package Exercises;

import java.util.Scanner;

public class Challenge_ReadingUserInput {

    public static void main(String[] args) {

        int count = 1;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);

        while (count<=10) {

            System.out.println("Enter Number #" + count);
            sum += scanner.nextInt();
            scanner.nextLine();

            count++;
        }
        System.out.println("The sum of your numbers was: " + sum);
        scanner.close();
    }


}
