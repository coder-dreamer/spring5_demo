package com.lhp.spring5_demo20.service;

import com.lhp.spring5_demo20.dao.UserAccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author 53137
 */
@Service
@Transactional
public class UserAccountService {
    @Autowired
    private UserAccountDao userDao;

    /**
     * 转账
     *
     * @param money
     * @param fromUserId
     * @param toUserId
     */
    public void transfer(double money, int fromUserId, int toUserId) {
        userDao.reduceMoney(money, fromUserId);
        //若不加事务,出现异常后,addMoney不执行,会导致出现异常,加上事务后,不会发生异常
        int a = 10 / 0;
        userDao.addMoney(money, toUserId);
    }

}
