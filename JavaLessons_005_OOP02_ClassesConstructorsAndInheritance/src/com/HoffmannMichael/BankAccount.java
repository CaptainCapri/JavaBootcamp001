package com.HoffmannMichael;

public class BankAccount {

  private String number;
  private int balance;
  private String customerName;
  private String email;
  private String phone;


  public String getNumber() {
    return number;
  }

  public int getBalance() {
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

  public void setBalance(int balance) {
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

  public void deposit(int depositAmount){
    balance =+ depositAmount;
    System.out.println(depositAmount + " NuYen added to your account. New balance: " + balance);
  }

  public void withdraw(int withdrawAmount){
    if (balance > withdrawAmount || withdrawAmount < 0) {
      System.out.println("Not enough NuYen on your balance, call Mr. Johnson for new runs");
    }
    else {
      balance =- withdrawAmount;
      System.out.println(withdrawAmount + " NuYen withdrawn from your account. New balance: " + balance);
    }
  }



}
