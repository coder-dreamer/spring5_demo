package com.lhp.spring5_demo7.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @author 53137
 */
public class MyBean implements FactoryBean<Course> {
    /**
     * 定义返回bean
     *
     * @return
     * @throws Exception
     */
    public Course getObject() throws Exception {
        Course course = new Course();
        course.setcName("数学");
        return course;

    }

    public Class<?> getObjectType() {
        return null;
    }
}
