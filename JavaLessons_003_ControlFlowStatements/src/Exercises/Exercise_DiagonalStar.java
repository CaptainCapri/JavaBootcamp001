package Exercises;

public class Exercise_DiagonalStar {

    public static void main(String[] args) {

        printSquareStar(10);

    }

    public static void printSquareStar(int number){

        if (number<5) System.out.println("Invalid Value");
        else {
            int row = 1;

            while (row <= number) {

                int column = 1;
                while (column <= number) {
                    if (row == number) System.out.print("*");
                    else if (row == 1) System.out.print("*");
                    else if (column == number) System.out.print("*");
                    else if (column == 1) System.out.print("*");
                    else if (column == row) System.out.print("*");
                    else if (column == (number - row + 1)) System.out.print("*");
                    else System.out.print(" ");
                    column++;
                }
                System.out.println();
                row++;
            }
        }

    }
}
