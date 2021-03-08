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
        return jdbcTemplate.update(sql, new Object[]{user.getName(), user.getSex()});
    }

    @Override
    public int updateUser(User user) {
        String sql = "update user set name = ? where id= ?";
        return jdbcTemplate.update(sql, new Object[]{user.getName(), user.getId()});
    }

    @Override
    public int deleteUser(User user) {
        String sql = "delete from user where id= ?";
        return jdbcTemplate.update(sql, new Object[]{user.getId()});
    }

    @Override
    public int selectCount() {
        String sql = "select count(*) from user";
        return jdbcTemplate.queryForObject(sql, Integer.class);
    }
}
