package com.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        // Student student = new Student();/
        // System.out.println(student.getStudentId());
        // System.out.println(student.getStudentName());
        // student.setStudentId("1");
        // student.setStudentName("이순신");

        ApplicationContext context =
            new ClassPathXmlApplicationContext("Beans.xml");
        Student student =
            context.getBean("student", Student.class);
            student.setStudentId("2");
            student.setStudentName("강감찬");
            System.out.println(student.getStudentName());
    }
}