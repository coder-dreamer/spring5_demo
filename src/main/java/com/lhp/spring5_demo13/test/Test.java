package com.lhp.spring5_demo13.test;


import com.lhp.spring5_demo13.service.UserService;
import com.lhp.spring5_demo13.service.UserService1;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo13/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        userService.add();

        UserService1 userService1 = context.getBean("userService1", UserService1.class);
        userService1.add();
    }

}
