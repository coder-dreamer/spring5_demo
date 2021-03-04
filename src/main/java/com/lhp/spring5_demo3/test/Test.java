package com.lhp.spring5_demo3.test;

import com.lhp.spring5_demo3.bean.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 53137
 */
public class Test {
    public static void main(String[] args) {
        book();
    }

    private static void book() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo3/bean.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        Book book1 = context.getBean("book1", Book.class);
        System.out.println(book1);
    }
}
