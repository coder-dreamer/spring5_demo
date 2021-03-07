package com.lhp.spring5_demo17.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @author 53137
 */
@Component
@Aspect
public class UserProxy {
    //前置通知
    @Before(value = "execution(* com.lhp.spring5_demo17.dao.UserDaoImpl.add(..))")
    public void before() {
        System.out.println("方法执行之前");
    }
    //最终通知
    @After(value = "execution(* com.lhp.spring5_demo17.dao.UserDaoImpl.*(..))")
    public void after() {
        System.out.println("最终通知，无论有无异常都执行");
    }
    //后置通知
    @AfterReturning(value = "execution(* com.lhp.spring5_demo17.dao.*.*(..))")
    public void afterReturn() {
        System.out.println("无异常执行");
    }
    //异常通知
    @AfterThrowing(value = "execution(* com.lhp.spring5_demo17.dao.UserDaoImpl.add(..))")
    public void afterThrowing() {
        System.out.println("方法抛出异常之后之星");
    }
    //环绕通知
    @Around(value = "execution(* com.lhp.spring5_demo17.dao.*.*(..))")
    public void around(ProceedingJoinPoint point) throws Throwable {
        System.out.println("环绕之前");
        //被增强的方法执行
        point.proceed();
        System.out.println("环绕之后");
    }

}
