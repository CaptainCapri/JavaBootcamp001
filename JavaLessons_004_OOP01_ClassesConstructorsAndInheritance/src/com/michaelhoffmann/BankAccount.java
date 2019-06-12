package com.michaelhoffmann;

public class BankAccount {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String getacccountNumber (){return accountNumber ;}
    public double getbalance (){return balance ;}
    public String getcustomerName (){return customerName ;}
    public String getemail (){return email ;}
    public String getphoneNumber (){return phoneNumber ;}


    public void setAccountNumber (String i) {this.accountNumber = i;}
    public void setBalance (double d) {this.balance = d;}
    public void setCustomerName (String s ) {this.customerName = s;}
    public void setEmail (String s) {this.email = s;}
    public void setPhoneNumber (String i) {this.phoneNumber = i;}



    public void deposit (double d){
        this.balance += d;

    }

    public void withdraw (double d){
        if (d<0) {
            System.out.println("no negative numbers!!!!!");
        }
        else if (d > balance){
            System.out.println("insufficient Funds!");
        }
        else this.balance -= d;
    }

}
