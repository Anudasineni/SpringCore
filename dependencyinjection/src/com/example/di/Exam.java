package com.example.di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Exam {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");

        Student s=context.getBean("student",Student.class);
       s.getName();
       s.getId();
        //System.out.println(s.getId());


    }
}
