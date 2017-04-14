package com.binhua.bridge.example01.implementor;

import com.binhua.bridge.example01.Implementor;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public class ConcreteImplementorB extends Implementor {
    @Override
    public void operationImpl() {
        System.out.println("B");
    }
}
