package com.binhua.factory.simple;

/**
 * Created by shaobinhua on 2017/3/12.
 */
public class DomainLogin implements Login {
    @Override
    public boolean verify(String name, String password) {
        System.out.println("domainLogin login success");
        return true;
    }
}
