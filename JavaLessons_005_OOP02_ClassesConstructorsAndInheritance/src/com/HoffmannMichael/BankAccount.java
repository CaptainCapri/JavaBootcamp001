package com.HoffmannMichael;

public class BankAccount {

  private String number;
  private double balance;
  private String customerName;
  private String email;
  private String phone;


  public BankAccount() {
    System.out.println("Empty constructor called");
  }

  public BankAccount(String number, double balance, String customerName, String email, String phone) {
    this.number = number;
    this.balance = balance;
    this.customerName = customerName;
    this.email = email;
    this.phone = phone;
  }

  public BankAccount(String customerName, String email, String phone) {
    this("999999",100.55, customerName, email,)
    this.customerName = customerName;
    this.email = email;
    this.phone = phone;
  }

  public String getNumber() {
    return number;
  }

  public double getBalance() {
    return balance;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getEmail() {
    return email;
  }

  public String getPhone() {
    return phone;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public void setBalance(double balance) {
    this.balance = balance;
  }

  public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public void deposit(double depositAmount){
    balance = balance + depositAmount;
    System.out.println(depositAmount + " NuYen added to your account. New balance: " + balance);
  }

  public void withdraw(double withdrawAmount){
    if ((this.balance - withdrawAmount) < 0) {
      System.out.println("Not enough NuYen on your balance, call Mr. Johnson for new runs");
    }
    else {
      balance = balance - withdrawAmount;
      System.out.println(withdrawAmount + " NuYen withdrawn from your account. New balance: " + balance);
    }
  }



}
