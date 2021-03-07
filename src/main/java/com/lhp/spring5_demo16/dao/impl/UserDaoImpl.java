package com.lhp.spring5_demo16.dao.impl;

import com.lhp.spring5_demo16.dao.UserDao;

/**
 * @author 53137
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("方法正在执行");
        return a + b;
    }

    @Override
    public void update(int a) {
        System.out.println(a);
    }
}
