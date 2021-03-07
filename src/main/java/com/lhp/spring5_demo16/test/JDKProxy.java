package com.lhp.spring5_demo16.test;

import com.lhp.spring5_demo16.dao.UserDao;
import com.lhp.spring5_demo16.dao.impl.UserDaoImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author 53137
 */
public class JDKProxy {
    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDao userDao = (UserDao) Proxy.newProxyInstance(UserDao.class.getClassLoader(),
                interfaces,
                new UserDaoProxy(new UserDaoImpl()));
        int result = userDao.add(1, 2);
        System.out.println("方法执行结果" + result);
    }
}

class UserDaoProxy implements InvocationHandler {
    /**
     * 被增强的对象
     */
    private Object obj;

    /**
     * 有参构造
     *
     * @param obj
     */
    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    /**
     * 增强逻辑
     *
     * @param proxy
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("方法执行之前");
        Object invoke = method.invoke(obj, args);
        System.out.println("方法执行之后");
        return invoke;
    }
}