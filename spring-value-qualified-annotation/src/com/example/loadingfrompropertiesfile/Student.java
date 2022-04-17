package com.example.loadingfrompropertiesfile;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {
    private String name;
    private String interestedCourse;
    private String hobby;
    @Value("${student.name}")

    public void setName(String name) {
        this.name = name;
    }
    @Required
    @Value("${student.interestedCourse}")
    public void setInterestedCourse(String interestedCourse) {
        this.interestedCourse = interestedCourse;
    }
    @Value("${student.hobby}")
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void displayInfo(){
        System.out.println("student name is "+name);
        System.out.println("student  is interestedCourse "+interestedCourse);
        System.out.println("student hobby is "+hobby);

    }
}
