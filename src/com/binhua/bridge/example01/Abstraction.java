package com.binhua.bridge.example01;

/**抽象化角色类
 * Created by shaobinhua on 2017/4/14.
 */
public abstract class Abstraction {
    protected Implementor implementor;

    public Abstraction(Implementor impl){
        this.implementor = impl;
    }

    //通过向实现化对象的委派(调用operationImpl()方法)实现
    protected void operation(){
        implementor.operationImpl();
    }
}
