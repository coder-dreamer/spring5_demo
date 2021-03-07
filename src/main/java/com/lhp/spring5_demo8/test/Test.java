package com.lhp.spring5_demo8.test;

import com.lhp.spring5_demo8.bean.MyBean;
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
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo8/bean.xml");
        //默认单例-地址一样
        //com.lhp.spring5_demo8.bean.MyBean@53b32d7
        //com.lhp.spring5_demo8.bean.MyBean@53b32d7
        MyBean bean = context.getBean("myBean", MyBean.class);
        MyBean bean1 = context.getBean("myBean", MyBean.class);
        System.out.println(bean);
        System.out.println(bean1);
        //指定单例-地址一样
        //com.lhp.spring5_demo8.bean.MyBean@61862a7f
        //com.lhp.spring5_demo8.bean.MyBean@61862a7f
        MyBean bean1_0 = context.getBean("myBean1", MyBean.class);
        MyBean bean1_1 = context.getBean("myBean1", MyBean.class);
        System.out.println(bean1_0);
        System.out.println(bean1_1);
        //指定多例-地址不一样
        //com.lhp.spring5_demo8.bean.MyBean@548e7350
        //com.lhp.spring5_demo8.bean.MyBean@1a968a59
        MyBean bean2_0 = context.getBean("myBean2", MyBean.class);
        MyBean bean2_1 = context.getBean("myBean2", MyBean.class);
        System.out.println(bean2_0);
        System.out.println(bean2_1);
    }

}
