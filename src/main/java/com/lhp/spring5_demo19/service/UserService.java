package com.lhp.spring5_demo19.service;

import com.lhp.spring5_demo19.bean.User;
import com.lhp.spring5_demo19.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * @author 53137
 */
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public int addUser(User user) {
        return userDao.addUser(user);
    }

    public int updateUser(User user) {
        return userDao.updateUser(user);
    }

    public int deleteUser(User user) {
        return userDao.deleteUser(user);
    }

    public int userCount() {
        return userDao.selectCount();
    }

    public User findUser(int id){
        return userDao.selectObject(id);
    }

    public List<User> findUserList(){
        return userDao.selectObjectList();
    }

    public int[] batchAddUser(List<User> userList){
        return userDao.batchAdd(userList);
    }
}
