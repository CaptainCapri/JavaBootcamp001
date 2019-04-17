package Exercises;

public class Lesson_ParsingValuesFromString {

    public static void main(String[] args) {
        String numberAsString = "2018.125";
        System.out.println("numberAsString= " + numberAsString);

        double number = Double.parseDouble(numberAsString);
        System.out.println("number = " + number);

        numberAsString += 1;
        number += 1.125;

        System.out.println("numberAsString = " + numberAsString);
        System.out.println("number = " + number);
    }

}
