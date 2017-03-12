package com.binhua.factory.simple.example;

import com.binhua.factory.simple.DomainLogin;
import com.binhua.factory.simple.Login;
import com.binhua.factory.simple.PasswordLogin;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class LoginFactory {
    public static Login factory(String type) {
        if(type.equals("password")){

            return new PasswordLogin();

        }else if(type.equals("passcode")){

            return new DomainLogin();

        }else{
            /**
             * 这里抛出一个自定义异常会更恰当
             */
            throw new RuntimeException("没有找到登录类型");
        }
    }
}
