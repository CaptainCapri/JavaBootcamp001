package com.HoffmannMichael;

public class VipCustomer {

  private String name;
  private double creditLimit;
  private String eMail;

  public String getName() {
    return name;
  }

  public double getCreditLimit() {
    return creditLimit;
  }

  public String geteMail() {
    return eMail;
  }

  public VipCustomer(String name, double creditLimit, String eMail) {
    this.name = name;
    this.creditLimit = creditLimit;
    this.eMail = eMail;
  }

  public VipCustomer() {
    this("JohnDoe", 0.00, "john@doe.com");
  }

  public VipCustomer(String name, double creditLimit) {
    this(name, creditLimit, "john@doe.com");
  }

}
