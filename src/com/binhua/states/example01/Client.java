package com.binhua.states.example01;

/**
 * Created by shaobinhua on 2017/4/15.
 */
public class Client {
    public static void main(String[] args) {
        State statea = new ConcreteStateA();
        Context context = new Context();
        context.setState(statea);
        context.requset("aa");
    }
}
