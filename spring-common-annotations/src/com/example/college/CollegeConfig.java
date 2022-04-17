package com.example.college;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class CollegeConfig {
    @Bean
    public Teacher mathTeacherBean(){
        return new MathTeacher();
    }
    @Bean
    public Principle principleBean(){//principlebean() will give object and passing it to the setPrinciple method.
        Principle principle=new Principle();
        return principle;
    }
    @Bean
    public College collegeBean(){
        College college=new College(mathTeacherBean());
       college.setPrinciple(principleBean());//passing Principle object through setter method to College class.
        //College.setTeacher(mathTeacherBean());
        System.out.println("using setPrinciple method");
        return college;
    }


}