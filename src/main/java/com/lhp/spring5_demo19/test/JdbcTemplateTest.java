package com.lhp.spring5_demo19.test;

        import com.lhp.spring5_demo19.bean.Sex;
        import com.lhp.spring5_demo19.bean.User;
        import com.lhp.spring5_demo19.service.UserService;
        import org.junit.Test;
        import org.springframework.context.ApplicationContext;
        import org.springframework.context.support.ClassPathXmlApplicationContext;

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
}
