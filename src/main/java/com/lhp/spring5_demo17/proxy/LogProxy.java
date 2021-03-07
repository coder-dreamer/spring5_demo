package com.lhp.spring5_demo17.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author 53137
 */
@Component
@Aspect
@Order(1)
public class LogProxy {
    @Pointcut(value = "execution(* com.lhp.spring5_demo17.dao.UserDaoImpl.add(..))")
    public void commonPoint() {

    }

    //前置通知
    @Before(value = "commonPoint()")
    public void before() {
        System.out.println("方法执行之前,打印日志");
    }

}
