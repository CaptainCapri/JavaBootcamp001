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
//        BankAccount HotDocsBankaccount = new BankAccount("35985792357", 0.00, "Hot Doc", "thehottest@doc.sr", "06660815");
//        HotDocsBankaccount.setBalance(0);
//        HotDocsBankaccount.setCustomerName("Hot Doc");
//        HotDocsBankaccount.setEmail("theHottest@doc.sr");
//        HotDocsBankaccount.setPhone("06660815");
//        HotDocsBankaccount.setNumber("35985792357");

//        HotDocsBankaccount.deposit(777);
//        System.out.println("Balance: " + HotDocsBankaccount.getBalance());
//        HotDocsBankaccount.withdraw(333);
//        System.out.println("Balance: " + HotDocsBankaccount.getBalance());
//        HotDocsBankaccount.withdraw(777);
//        System.out.println("Balance: " + HotDocsBankaccount.getBalance());
//        HotDocsBankaccount.withdraw(-12);
//
//        System.out.println("Name: " + HotDocsBankaccount.getCustomerName());
//        System.out.println("Number: " + HotDocsBankaccount.getNumber());
//        System.out.println("Phone: " + HotDocsBankaccount.getPhone());
//        System.out.println("Phone: " + HotDocsBankaccount.getEmail());



//        BankAccount michisAccount = new BankAccount("Michi", "michi@email.com", "0815");
//        System.out.println(michisAccount.getNumber() + " name: " + michisAccount.getCustomerName());
//
//        System.out.println("\n");
//
//        VipCustomer hotDocsVipAccount = new VipCustomer("Hot Doc", 13, "thehottest@doc.sr");
//        System.out.println(hotDocsVipAccount.getName() + hotDocsVipAccount.getCreditLimit() + hotDocsVipAccount.geteMail());
//
//        VipCustomer xargothVipAccount = new VipCustomer("Xargoth", 17000);
//        System.out.println(xargothVipAccount.getName() + xargothVipAccount.getCreditLimit() + xargothVipAccount.geteMail());
//
//        VipCustomer diegosVipAccount = new VipCustomer();
//        System.out.println(diegosVipAccount.getName() + diegosVipAccount.getCreditLimit() + diegosVipAccount.geteMail());



//        Wall wall01 = new Wall(5, 4);
//        System.out.println("area= " + wall01.getArea());
//
//        wall01.setHeight(-1.5);
//        System.out.println("width= " + wall01.getWidth());
//        System.out.println("height= " + wall01.getHeight());
//        System.out.println("area= " + wall01.getHeight());

//        wall01.setWidth(-1.5);
//        System.out.println("width= " + wall01.getWidth());
//        System.out.println("height= " + wall01.getHeight());
//        System.out.println("area= " + wall01.getHeight());


//        Carpet carpet01 = new Carpet(3.5);
//        Floor floor01 = new Floor(2.75, 4.0);
//        Calculator calculator = new Calculator(floor01, carpet01);
//        System.out.println("total: " + calculator.getTotalCost());

//        carpet01 = new Carpet(1.5);
//        floor01 = new Floor(5.4, 4.5);
//        calculator = new Calculator(floor01, carpet01);
//        System.out.println("total: " + calculator.getTotalCost());

        ComplexNumber one = new ComplexNumber(1.0, 1.0);
        ComplexNumber number = new ComplexNumber(2.5, -1.5);
        one.add(1,1);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        one.subtract(number);
        System.out.println("one.real= " + one.getReal());
        System.out.println("one.imaginary= " + one.getImaginary());
        number.subtract(one);
        System.out.println("number.real= " + number.getReal());
        System.out.println("number.imaginary= " + number.getImaginary());




    }

}
