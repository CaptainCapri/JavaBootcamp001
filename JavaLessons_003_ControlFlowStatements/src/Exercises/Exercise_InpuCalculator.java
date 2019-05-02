package Exercises;

import java.util.Scanner;

public class Exercise_InpuCalculator {

    public static void main(String[] args) {

        inputThenPrintSumAndAverage();

    }

    public static void inputThenPrintSumAndAverage(){
        int sum = 0;
        int count = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            boolean isAnInt = scanner.hasNextInt();

            if(isAnInt){
                sum += scanner.nextInt();
                count ++;
            }else {
                float average = sum / count;

                average = Math.round(average);
                sum = Math.round(sum);

                int sumI = (int) sum;
                int averageI = (int) average;

                System.out.println("SUM = " + sumI + " AVG = " + averageI);
                break;
            }
        }
        scanner.nextLine();
        scanner.close();
    }
}
