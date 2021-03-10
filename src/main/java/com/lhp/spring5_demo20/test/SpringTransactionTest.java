package com.lhp.spring5_demo20.test;

import com.lhp.spring5_demo20.bean.Sex;
import com.lhp.spring5_demo20.bean.User;
import com.lhp.spring5_demo20.config.SpringConfig;
import com.lhp.spring5_demo20.service.UserAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 53137
 */
public class SpringTransactionTest {

    @Test
    public void add() {
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserAccountService userAccountService = context.getBean("userAccountService", UserAccountService.class);
        userAccountService.transfer(100, 1, 2);
    }
}
