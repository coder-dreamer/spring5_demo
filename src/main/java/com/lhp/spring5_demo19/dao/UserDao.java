package com.lhp.spring5_demo19.dao;

import com.lhp.spring5_demo19.bean.User;

import java.util.List;

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

    /**
     * 更新用户
     *
     * @param user
     * @return
     */
    int updateUser(User user);

    /**
     * 删除用户
     *
     * @param user
     * @return
     */
    int deleteUser(User user);

    /**
     * 查询记录数
     *
     * @return
     */
    int selectCount();

    /**
     * 查询返回对象
     *
     * @param id
     * @return
     */
    User selectObject(int id);

    /**
     * 查询返回集合
     *
     * @return
     */
    List<User> selectObjectList();

    /**
     * 批量添加用户
     *
     * @param userList
     * @return
     */
    int[] batchAdd(List<User> userList);

    /**
     * 批量更新用户
     *
     * @param userList
     * @return
     */
    int[] batchUpdate(List<User> userList);

    /**
     * 批量删除用户
     *
     * @param idList
     * @return
     */
    int[] batchDelete(List<Integer> idList);
}
