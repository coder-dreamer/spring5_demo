package com.lhp.spring5_demo5.test;

import com.lhp.spring5_demo4.service.UserService;
import com.lhp.spring5_demo4.service.impl.UserServiceImpl;
import com.lhp.spring5_demo5.bean.User;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo5/bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
    }

    private static void test1() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo5/bean.xml");
        User user1 = context.getBean("user1", User.class);
        System.out.println(user1);
    }

    private static void test2() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo5/bean.xml");
        User user2 = context.getBean("user2", User.class);
        System.out.println(user2);
    }
}
