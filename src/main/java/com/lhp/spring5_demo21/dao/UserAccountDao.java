package com.lhp.spring5_demo21.dao;

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
