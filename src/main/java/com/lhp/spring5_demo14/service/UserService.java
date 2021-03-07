package com.lhp.spring5_demo14.service;

import com.lhp.spring5_demo14.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author 53137
 */
@Service
public class UserService {
    //使用Autowired和Qualifier完成属性注入
    //@Autowired
    //@Qualifier(value = "userDaoImpl1")
    //private UserDao userDao;

    //使用Resource完成属性注入
    //仅Resource代表根据类型进行注入
    //@Resource
    //private UserDao userDao;

    //使用Resource完成属性注入
    //Resource和name结合使用代表根据名称进行注入
    @Resource(name = "userDaoImpl")
    private UserDao userDao;

    //使用value完成属性注入
    @Value(value = "lhp")
    private String name;

    public void add() {
        System.out.println("name=" + name);
        System.out.println("调用userDao");
        userDao.add();
    }
}
