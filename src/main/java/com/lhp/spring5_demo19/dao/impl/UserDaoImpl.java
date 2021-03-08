package com.lhp.spring5_demo19.dao.impl;

import com.lhp.spring5_demo19.bean.Sex;
import com.lhp.spring5_demo19.bean.User;
import com.lhp.spring5_demo19.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public User selectObject(int id) {
        String sql = "select * from user where id = ?";
        return jdbcTemplate.queryForObject(sql, new BeanPropertyRowMapper<User>(User.class), id);
    }

    @Override
    public List<User> selectObjectList() {
        String sql = "select * from user";
        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<User>(User.class));
    }

    @Override
    public int[] batchAdd(List<User> userList) {
        String sql = "insert into user (name,sex) values(?,?)";
        List<Object[]> userInfoList = new ArrayList<>();
        userList.forEach(user -> {
            userInfoList.add(new Object[]{user.getName(), user.getSex()});
        });
        return jdbcTemplate.batchUpdate(sql, userInfoList);
    }
}
