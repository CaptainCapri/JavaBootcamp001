package com.michaelhoffmann;

import sun.java2d.pipe.SpanShapeRenderer;

public class Main {

    public static void main(String[] args) {


//        Car ford = new Car();
//        Car delorean = new Car();
//
//
//        ford.setModel("Pursuit Special");
//
//        System.out.println("Model is " + ford.getModel());

//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());


    BankAccount myBankaccount = new BankAccount();

    myBankaccount.setCustomerName("Michael Hoffmann");
    myBankaccount.setAccountNumber("0815");
    myBankaccount.setBalance(0);
    myBankaccount.setPhoneNumber("0190666666");
    myBankaccount.setEmail("awesome@bed.de");

        System.out.println("Accountnumber: " + myBankaccount.getacccountNumber());
        System.out.println("Name: " + myBankaccount.getcustomerName());
        System.out.println("Email: " + myBankaccount.getemail());
        System.out.println("Balance: " + myBankaccount.getbalance());
        System.out.println("PhoneNumber: " + myBankaccount.getphoneNumber());
        System.out.println("_____________________________________________");

        myBankaccount.deposit(353);

        myBankaccount.withdraw(215);

        System.out.println("Accountnumber: " + myBankaccount.getacccountNumber());
        System.out.println("Name: " + myBankaccount.getcustomerName());
        System.out.println("Email: " + myBankaccount.getemail());
        System.out.println("Balance: " + myBankaccount.getbalance());
        System.out.println("PhoneNumber: " + myBankaccount.getphoneNumber());
        System.out.println("_____________________________________________");

    }
}
