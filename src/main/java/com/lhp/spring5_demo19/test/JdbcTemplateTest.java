package com.lhp.spring5_demo19.test;

import com.lhp.spring5_demo19.bean.Sex;
import com.lhp.spring5_demo19.bean.User;
import com.lhp.spring5_demo19.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 53137
 */
public class JdbcTemplateTest {

    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int value = userService.addUser(new User("lhp", Sex.男.name()));
        System.out.println(value);
    }

    @Test
    public void update() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int value = userService.updateUser(new User(1, "lhp1111"));
        System.out.println(value);
    }

    @Test
    public void delete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int value = userService.deleteUser(new User(1));
        System.out.println(value);
    }

    @Test
    public void selectCount() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        int value = userService.userCount();
        System.out.println(value);
    }

    @Test
    public void selectObject() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        User user = userService.findUser(2);
        System.out.println(user.toString());
    }

    @Test
    public void selectObjectList() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> userList = userService.findUserList();
        System.out.println(userList);
    }

    @Test
    public void batchAdd() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            userList.add(new User("lhp" + i, i % 2 == 0 ? Sex.男.name() : Sex.女.name()));
        }
        System.out.println(Arrays.toString(userService.batchAddUser(userList)));
    }

    @Test
    public void batchUpdate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<User> userList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            userList.add(new User(i, "lhp" + i + 1, i % 2 == 0 ? Sex.女.name() : Sex.男.name()));
        }
        System.out.println(Arrays.toString(userService.batchUpdateUser(userList)));
    }

    @Test
    public void batchDelete() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo19/bean.xml");
        UserService userService = context.getBean("userService", UserService.class);
        List<Integer> idList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            idList.add(i);
        }
        System.out.println(Arrays.toString(userService.batchDeleteUser(idList)));
    }
}
