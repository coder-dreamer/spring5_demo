package com.lhp.spring5_demo18.test;


import com.lhp.spring5_demo18.dao.UserDaoImpl;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo18/bean.xml");
        UserDaoImpl userDaoImpl = context.getBean("userDaoImpl", UserDaoImpl.class);
        userDaoImpl.add();
    }
}
