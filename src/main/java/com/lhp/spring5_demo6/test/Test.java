package com.lhp.spring5_demo6.test;

import com.lhp.spring5_demo6.bean.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 53137
 */
public class Test {
    public static void main(String[] args) {
        test();
        test1();
        test2();
    }

    private static void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo6/bean.xml");
        Student student = context.getBean("student", Student.class);
        System.out.println(student);
    }

    private static void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo6/bean.xml");
        Student student = context.getBean("student1", Student.class);
        System.out.println(student);
    }
    private static void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo6/bean.xml");
        Student student = context.getBean("student2", Student.class);
        System.out.println(student);
    }
}
