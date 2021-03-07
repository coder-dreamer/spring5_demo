package com.lhp.spring5_demo17.dao;

import org.springframework.stereotype.Component;

/**
 * @author 53137
 */
@Component
public class UserDaoImpl {
    public void add() {
        int  a = 10/0;
        System.out.println("add...........");
    }
}
