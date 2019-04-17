package Exercises;

public class Exercise_SharedDigit {

    public static void main(String[] args) {

        System.out.println("Has shared digit? " + hasSharedDigit(12,13));

    }

    public static boolean hasSharedDigit (int number1, int number2){

        if (number1 < 10 || number1 > 99 || number2 < 10 || number2 > 99) return false;

        int check1 = -1;
        int check2 = -1;

        while (number1 > 0){
            check1 = number1 % 10;
            int number2a = number2;

            while (number2a > 0){

                check2 = number2a % 10;

                if (check1 == check2) return true;

                number2a /= 10;
            }
            number1 /= 10;
        }

        return false;

    }

}
