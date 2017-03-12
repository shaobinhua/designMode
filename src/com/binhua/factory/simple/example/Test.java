package com.binhua.factory.simple.example;

import com.binhua.factory.simple.Login;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class Test {
    public static void main(String[] args) {
        String loginType = "password";
        String name = "name";
        String password = "password";
        Login login = LoginFactory.factory(loginType);
        boolean bool = login.verify(name, password);
        if (bool) {
            System.out.println("Login ok");
        } else {
            System.out.println("Login error");
        }
    }
}
