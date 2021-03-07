package com.lhp.spring5_demo9.test;

import com.lhp.spring5_demo8.bean.MyBean;
import com.lhp.spring5_demo9.bean.User;
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
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo9/bean.xml");
        User user = context.getBean("user", User.class);
        System.out.print("6.获取实例对象");
        System.out.println(user);
        //销毁bean
        context.close();
    }

}
