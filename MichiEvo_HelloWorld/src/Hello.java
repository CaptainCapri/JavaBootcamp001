/**
 * Created by at00151211 on 10.07.2017.
 */
public class Hello {
    public static void main (String[] args)
    {
        System.out.println("Hello, World!");
        int myFirstNumber = 10;
        int mySecondNumber = 13;
        int myThirdNumber = (mySecondNumber + myFirstNumber) * 2;

        int myResult = myFirstNumber + mySecondNumber + myThirdNumber;
        int myResult2 = 1000 - myResult;

        System.out.println(myFirstNumber);
        System.out.println(myFirstNumber += 3);
        System.out.println(myThirdNumber);
        System.out.println(myResult2);

    }
}
