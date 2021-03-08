package com.lhp.spring5_demo19.dao;

import com.lhp.spring5_demo19.bean.User;

/**
 * @author 53137
 */
public interface UserDao {
    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    int addUser(User user);
}
