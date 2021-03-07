package com.lhp.spring5_demo14.test;


import com.lhp.spring5_demo14.service.UserService;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo14/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();
    }

}
