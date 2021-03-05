package com.lhp.spring5_demo6.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author 53137
 */
public class Student {
    private String[] course;
    private List<String> names;
    private Map<String, String> courseInfo;
    private Set<String> set;

    public void setCourse(String[] course) {
        this.course = course;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }

    public void setCourseInfo(Map<String, String> courseInfo) {
        this.courseInfo = courseInfo;
    }

    public void setSet(Set<String> set) {
        this.set = set;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + Arrays.toString(course) +
                ", names=" + names +
                ", courseInfo=" + courseInfo +
                ", set=" + set +
                '}';
    }
}
