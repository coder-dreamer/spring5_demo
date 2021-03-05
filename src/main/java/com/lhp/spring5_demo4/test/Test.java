package com.lhp.spring5_demo4.test;

import com.lhp.spring5_demo3.bean.Book;
import com.lhp.spring5_demo4.service.UserService;
import com.lhp.spring5_demo4.service.impl.UserServiceImpl;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo4/bean.xml");
        UserService userService = context.getBean("userService", UserServiceImpl.class);
        userService.addUser();
    }
}
