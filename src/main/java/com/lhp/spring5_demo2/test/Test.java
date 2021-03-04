package com.lhp.spring5_demo2.test;

import com.lhp.spring5_demo2.bean.Book;
import com.lhp.spring5_demo2.bean.Orders;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 53137
 */
public class Test {
    public static void main(String[] args) {
        //book();
        order();
    }

    private static void book() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo2/bean.xml");
        Book book = context.getBean("book", Book.class);
        System.out.println(book);
        System.out.println(book.getbName());
        System.out.println(book.getbAuthor());
    }

    private static void order() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo2/bean.xml");
        Orders order = context.getBean("order", Orders.class);
        System.out.println(order);
    }
}
