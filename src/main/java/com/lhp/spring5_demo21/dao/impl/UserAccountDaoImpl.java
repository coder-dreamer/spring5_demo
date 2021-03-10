package com.lhp.spring5_demo21.dao.impl;

import com.lhp.spring5_demo21.dao.UserAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author 53137
 */
@Repository
public class UserAccountDaoImpl implements UserAccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int addMoney(double money, int toUserId) {
        return jdbcTemplate.update("update user_account set account=account+? where id=?", new Object[]{money, toUserId});
    }

    @Override
    public int reduceMoney(double money, int toUserId) {
        return jdbcTemplate.update("update user_account set account=account-? where id=?", new Object[]{money, toUserId});
    }
}
