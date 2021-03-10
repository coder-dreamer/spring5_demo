package com.lhp.spring5_demo20.dao;

import com.lhp.spring5_demo20.bean.User;

import java.util.List;

/**
 * @author 53137
 */
public interface UserAccountDao {

    /**
     * 增加钱
     *
     * @param money
     * @param toUserId
     * @return
     */
    int addMoney(double money, int toUserId);

    /**
     * 减少钱
     *
     * @param money
     * @param toUserId
     * @return
     */
    int reduceMoney(double money, int toUserId);

}
