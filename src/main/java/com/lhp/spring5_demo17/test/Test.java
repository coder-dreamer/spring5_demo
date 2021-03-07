package com.lhp.spring5_demo17.test;


import com.lhp.spring5_demo15.config.SpringConfig;
import com.lhp.spring5_demo15.service.UserService;
import com.lhp.spring5_demo17.dao.UserDaoImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 53137
 */
public class Test {
    public static void main(String[] args) {
        test();
    }

    private static void test() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo17/bean.xml");
        UserDaoImpl userDaoImpl = context.getBean("userDaoImpl", UserDaoImpl.class);
        userDaoImpl.add();
    }
}
