package com.lhp.spring5_demo14.dao.impl;

import com.lhp.spring5_demo14.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 53137
 */
@Repository(value = "userDaoImpl1")
public class UserDaoImpl1 implements UserDao {
    @Override
    public void add() {
        System.out.println("add user to db1");
    }
}
