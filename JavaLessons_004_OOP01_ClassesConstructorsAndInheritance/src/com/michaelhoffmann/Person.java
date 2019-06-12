package com.michaelhoffmann;

public class Person {

    private String firstName;
    private String lastName;
    private int age;


    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }




    public void setFirstName(String s){
        this.firstName = s;
    }

    public void setLastName(String s){
        this.lastName = s;
    }

    public void setAge(int i){
        if ((i<0)||(i>100)) this.age = 0;
        else this.age = i;
    }

    public boolean isTeen(){
        if ((age>12) && (age<20)) return true;
        else return false;
    }

    public String getFullName(){
        if((firstName.isEmpty()) && (lastName.isEmpty())) return "";
        else if (firstName.isEmpty()) return lastName;
        else if (lastName.isEmpty()) return firstName;
        else return firstName + " " + lastName;
    }



}
