package com.example.college;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
    public static void main(String[] args)  {
        ApplicationContext context=new AnnotationConfigApplicationContext(CollegeConfig.class);
        College c= context.getBean("collegeBean",College.class);
       // Principle P= context.getBean("principlebean",Principle.class);
        c.test();
    }
}


