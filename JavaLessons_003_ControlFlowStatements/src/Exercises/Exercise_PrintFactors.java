package Exercises;

public class Exercise_PrintFactors {

    public static void main(String[] args) {

        printFactors(6);

    }

    public static void printFactors(int number) {
        if (number<1) System.out.println("Invalid Value");

        int factor = 1;

        while (factor<=number){
            if ((number%factor)==0) System.out.println(factor);
            factor++;
        }

    }


}
