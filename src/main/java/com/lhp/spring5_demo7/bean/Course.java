package com.lhp.spring5_demo7.bean;

/**
 * @author 53137
 */
public class Course {
    private String cName;

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "cName='" + cName + '\'' +
                '}';
    }
}
