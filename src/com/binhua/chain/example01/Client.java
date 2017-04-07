package com.binhua.chain.example01;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class Client {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler();
        Handler handler2 = new SuccessHandler();
        handler1.setSuccessor(handler2);
        handler1.handlerRequest();
    }
}
