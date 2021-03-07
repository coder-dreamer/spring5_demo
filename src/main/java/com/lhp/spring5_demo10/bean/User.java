package com.lhp.spring5_demo10.bean;

/**
 * @author 53137
 */
public class User {
    private Course course;

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "User{" +
                "course=" + course +
                '}';
    }
}
