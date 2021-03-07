package com.lhp.spring5_demo7.test;

import com.lhp.spring5_demo7.bean.Course;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo7/bean.xml");
        //返回值类型可以不是定义的bean类型！
        Course course = context.getBean("myBean", Course.class);
        System.out.println(course);
    }

}
