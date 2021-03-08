package com.lhp.spring5_demo19.test;

import com.lhp.spring5_demo19.bean.Sex;
import com.lhp.spring5_demo19.bean.User;
import com.lhp.spring5_demo19.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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


}
