package com.lhp.spring5_demo4.service.impl;

import com.lhp.spring5_demo4.dao.UserDao;
import com.lhp.spring5_demo4.service.UserService;

/**
 * @author 53137
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void addUser() {
        userDao.insert();
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
