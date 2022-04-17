package com.example.loadingfrompropertiesfile;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
        Student s= context.getBean("student",Student.class);
         s.displayInfo();
    }
}
