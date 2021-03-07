package com.lhp.spring5_demo10.test;

import com.lhp.spring5_demo10.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 53137
 */
public class Test {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo10/bean.xml");

        User user = context.getBean("user", User.class);
        User user1 = context.getBean("user1", User.class);
        System.out.println(user);
        System.out.println(user1);
    }

}
