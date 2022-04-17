package com.beanlifecycle.annotation;

import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.sql.*;

public class StudentDAO {
    private String url;
    private String username;
    private String password;
    Connection con;

    public void setUsername(String username) {

        this.username = username;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public void setUrl(String url) {

        this.url = url;
    }

    @PostConstruct  //@PostConstruct init() is called after initiating object and setting properties.
    public void init() throws SQLException {
        System.out.println("init method called");
        createConnection();
    }

    public void createConnection() throws SQLException {
        con = DriverManager.getConnection(url, username, password);
    }

    public void selectAllRows() throws SQLException {
        Statement statement = con.createStatement();
        ResultSet rs = statement.executeQuery("select * from hostelStudentInfo");
        System.out.println("Student records are");

        while (rs.next()) {
            int studentId = rs.getInt(1);
            String studentName = rs.getString(2);
            Double hostelFee = rs.getDouble(3);
            String foodType = rs.getString(4);
            System.out.println(studentId + " " + studentName + " " + hostelFee + " " + foodType);

        }

    }

    public void deleteAllRows(int studentId) throws SQLException {
        Statement statement = con.createStatement();
        statement.executeUpdate("delete  from hostelStudentInfo where studentId = " + studentId);
        System.out.println("deleted the record");
    }

    public void destroyConnection() throws SQLException {
        con.close();
    }
    @PreDestroy //@preDestroy destroy method called after Application Context close(spring container)
    public void destroy() throws SQLException {
        destroyConnection();
        System.out.println("object is destroyed");
    }
}
