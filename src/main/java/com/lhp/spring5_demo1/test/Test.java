package com.lhp.spring5_demo1.test;

import com.lhp.spring5_demo1.bean.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 53137
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo1/bean.xml");
        User user = context.getBean("user", User.class);
        System.out.println(user);
        user.test();
    }

}
