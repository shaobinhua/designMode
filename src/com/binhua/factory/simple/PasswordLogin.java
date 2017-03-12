package com.binhua.factory.simple;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class PasswordLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        System.out.println("PasswordLogin login success");
        return true;
    }
}
