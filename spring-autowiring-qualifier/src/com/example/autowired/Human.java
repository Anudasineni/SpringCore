package com.example.autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {


    private Heart heart; //Heart reference variable name and bean id name need to match for autowiring
    private int num;//Autowired did not support for Primitive data types(int,String etc..,)

    public Human() { //default constructor should be create when using @Autowired to inject value.
    }

    public Human(Heart heart) {
       this.heart = heart;
        System.out.println("human constructor is called which has heart has arg");
   }

    @Autowired
    @Qualifier("heartValueObject1")
    public void setHeart(Heart heart) {
        this.heart = heart;
    }

    public void setNum(int num) {
        this.num = num;
        System.out.println(num);
    }

    public void startPumping() {
        if (heart != null) {
            heart.pump();
           System.out.println("hi "+heart.NameofPerson +" has "+heart.noOfHearts);
        } else {
            System.out.println("your are not well");
        }
    }
}
