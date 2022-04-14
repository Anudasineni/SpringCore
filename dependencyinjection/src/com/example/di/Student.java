package com.example.di;
//injecting String literals and primitive data types using setter methods and constructor
public class Student {
    private int id;
    private String studentName;

    public Student(int id,String studentName) {
        this.id = id;
        this.studentName = studentName;

    }

public void getId(){
        System.out.println(this.id);
}
    public void getName() {
        System.out.println(this.studentName);
    }

}
