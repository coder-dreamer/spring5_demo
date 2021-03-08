package com.lhp.spring5_demo19.dao.impl;

import com.lhp.spring5_demo19.bean.Sex;
import com.lhp.spring5_demo19.bean.User;
import com.lhp.spring5_demo19.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 53137
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addUser(User user) {
        String sql = "insert into user(name,sex) values(?,?)";
        int value = jdbcTemplate.update(sql, new Object[]{user.getName(), user.getSex()});
        return value;
    }
}
