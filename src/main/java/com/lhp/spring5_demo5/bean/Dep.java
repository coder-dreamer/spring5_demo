package com.lhp.spring5_demo5.bean;

/**
 * 部门
 *
 * @author 53137
 */
public class Dep {
    private String name;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Dep{" +
                "name='" + name + '\'' +
                '}';
    }
}
