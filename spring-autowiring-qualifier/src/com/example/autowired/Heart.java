package com.example.autowired;

public class Heart {
    int noOfHearts;
    String NameofPerson;

    public void setNoOfHearts(int noOfHearts) {
        this.noOfHearts = noOfHearts;
        System.out.println("setter method called which has noOfHearts as argument");
    }

    public void setNameofPerson(String nameofPerson) {
        NameofPerson = nameofPerson;
    }

    public void pump(){
        System.out.println("your heart is pumping");
        System.out.println("your alive");
    }
}
