package com.lhp.spring5_demo9.bean;

/**
 * @author 53137
 */
public class User {
    private String uName;

    public User() {
        System.out.println("1.指定无参构造，创建bean");
    }

    public void setuName(String uName) {
        this.uName = uName;
        System.out.println("2.调用set方法，设置属性");
    }

    public void initMethod() {
        System.out.println("4.执行初始化方法");
    }

    public void destroyMethod() {
        System.out.println("7.执行销毁方法");
    }
}
