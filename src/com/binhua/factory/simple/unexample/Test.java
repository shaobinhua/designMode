package com.binhua.factory.simple.unexample;

import com.binhua.factory.simple.DomainLogin;
import com.binhua.factory.simple.PasswordLogin;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class Test {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        String loginType = "password";
        String name = "name";
        String password = "password";
        //处理口令认证
        if(loginType.equals("password")){
            PasswordLogin passwordLogin = new PasswordLogin();
            boolean bool = passwordLogin.verify(name, password);
            if (bool) {
                /**
                 * 业务逻辑
                 */
            } else {
                /**
                 * 业务逻辑
                 */
            }
        }
        //处理域认证
        else if(loginType.equals("passcode")){
            DomainLogin domainLogin = new DomainLogin();
            boolean bool = domainLogin.verify(name, password);
            if (bool) {
                /**
                 * 业务逻辑
                 */
            } else {
                /**
                 * 业务逻辑
                 */
            }
        }else{
            /**
             * 业务逻辑
             */
        }
    }
}
