package com.lhp.spring5_demo21.test;

import com.lhp.spring5_demo20.config.SpringConfig;
import com.lhp.spring5_demo21.service.UserAccountService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author 53137
 */
public class SpringTransactionTest {

    @Test
    public void add() {
        ApplicationContext context = new ClassPathXmlApplicationContext("com.lhp.spring5_demo21/bean.xml");
        UserAccountService userAccountService = context.getBean("userAccountService", UserAccountService.class);
        userAccountService.transfer(100, 1, 2);
    }
}
