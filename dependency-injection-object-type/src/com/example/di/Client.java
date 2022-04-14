package com.example.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
      /*  Student student=new Student(); here we created two objects and
      passing MathCheat class reference(mathCheat) through SetMathcheat.and finally calling cheating method.
        MathCheat mathCheat=new MathCheat();
        student.setMathcheat(mathCheat);
        student.cheating();
 spring will create and inject objects through setter methods and constructor.iam just
 calling cheating() method here */


        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");//to read bean.xml file
        Student s=context.getBean("student",Student.class);//it is nothing but new Student().
        s.cheating();
        AnotherStudent anotherStudent=context.getBean("anotherstudent",AnotherStudent.class);
        anotherStudent.startcheating();
/* here were creating two objects for MathCheat class.since we are using MathsCheat
 in two classes(Student,AnotherStudent).lets assume that we have 100 students and those 100 students wants to
  MathCheat,fot that we should create 100 objects.This process makes application performance less.
   To make our aplication less weight ,we have to create 1 MathCheat Object for all the Students and will use that
   ref when you want use MathCheat class.
 */
    }
}
