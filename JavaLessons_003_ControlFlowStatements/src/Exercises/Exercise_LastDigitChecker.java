package Exercises;

public class Exercise_LastDigitChecker {

    public static void main(String[] args) {

    }

    public static boolean hasSameLastDigit (int number1, int number2, int number3){
        if (!isValid(number1)||!isValid(number2)||!isValid(number3) ) return false;

            int check1 = number1%10;
            int check2 = number2%10;
            int check3 = number3%10;
                if (check1 == check2) return true;
                else if (check1 == check3) return true;
                else if (check2 == check3) return true;
                else return false;
    }

    public static boolean isValid (int checkNumber){
        if (checkNumber<10 || checkNumber>1000) return false;
        else return true;

    }


}
