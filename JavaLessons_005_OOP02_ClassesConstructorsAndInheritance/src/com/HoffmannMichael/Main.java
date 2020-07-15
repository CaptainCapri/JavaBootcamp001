package com.HoffmannMichael;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

//      CAR-CLASS
//        Car ford = new Car();
//        Car delorean = new Car();
//
//
//        ford.setModel("V8Interceptor");
//        System.out.println("Model is: " + ford.getModel());

//       SIMPLECALCULATOR CLASS
//        SimpleCalculator calculator = new SimpleCalculator();
//        calculator.setFirstNumber(5.0);
//        calculator.setSecondNumber(4);
//        System.out.println("add= " + calculator.getAdditionResult());
//        System.out.println("subtract= " + calculator.getSubtractionResult());
//        calculator.setFirstNumber(5.25);
//        calculator.setSecondNumber(0);
//        System.out.println("multiply= " + calculator.getMultiplicationResult());
//        System.out.println("divide= " + calculator.getDivisionResult());

//      PERSON-CLASS
//        Person person = new Person();
//        person.setFirstName("");
//        person.setLastName("");
//        person.setAge(10);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setFirstName("John");
//        person.setAge(18);
//        System.out.println("fullName= " + person.getFullName());
//        System.out.println("teen= " + person.isTeen());
//        person.setLastName("Smith");
//        System.out.println("fullName= " + person.getFullName());


//     BANK ACCOUNT - CLASS
        BankAccount HotDocsBankaccount = new BankAccount("35985792357", 0.00, "Hot Doc", "thehottest@doc.sr", "06660815");
//        HotDocsBankaccount.setBalance(0);
//        HotDocsBankaccount.setCustomerName("Hot Doc");
//        HotDocsBankaccount.setEmail("theHottest@doc.sr");
//        HotDocsBankaccount.setPhone("06660815");
//        HotDocsBankaccount.setNumber("35985792357");

        HotDocsBankaccount.deposit(777);
        System.out.println("Balance: " + HotDocsBankaccount.getBalance());
        HotDocsBankaccount.withdraw(333);
        System.out.println("Balance: " + HotDocsBankaccount.getBalance());
        HotDocsBankaccount.withdraw(777);
        System.out.println("Balance: " + HotDocsBankaccount.getBalance());
        HotDocsBankaccount.withdraw(-12);

        System.out.println("Name: " + HotDocsBankaccount.getCustomerName());
        System.out.println("Number: " + HotDocsBankaccount.getNumber());
        System.out.println("Phone: " + HotDocsBankaccount.getPhone());
        System.out.println("Phone: " + HotDocsBankaccount.getEmail());

    }

}
