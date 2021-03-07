package com.lhp.spring5_demo15.dao.impl;

import com.lhp.spring5_demo15.dao.UserDao;
import org.springframework.stereotype.Repository;

/**
 * @author 53137
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("add user to db");
    }
}
