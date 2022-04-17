package com.beanlifecycle.annotation;

import com.beanlifecycle.annotation.StudentDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        StudentDAO dao = context.getBean("daoBean", StudentDAO.class);
        dao.selectAllRows();
        dao.deleteAllRows(4);
        ((ClassPathXmlApplicationContext) context).close();//before object destroyed (context.close) @preDestroy
        //destroy method called and it is used for close the resources before  object destruction in Spring container.

        ((ClassPathXmlApplicationContext) context).registerShutdownHook(); //registerShutdownHook will called once
        //main thread ends.so all code gets executed , it will be called(registerShutdownHook) and It will close
        //your container.It will not give exception irrespective of line we are calling it.


    }
}
