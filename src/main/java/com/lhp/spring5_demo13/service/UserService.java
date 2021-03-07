package com.lhp.spring5_demo13.service;

import com.lhp.spring5_demo13.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author 53137
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void add() {
        System.out.println("调用userDao");
        userDao.add();
    }
}
