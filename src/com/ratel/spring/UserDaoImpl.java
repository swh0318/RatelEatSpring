package com.ratel.spring;

public class UserDaoImpl implements UserDao{
    @Override
    public void say() {
        System.out.println("UserDao say hello world!");
    }
}
