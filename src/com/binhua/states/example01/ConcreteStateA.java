package com.binhua.states.example01;

/**具体状态类
 * Created by shaobinhua on 2017/4/15.
 */
public class ConcreteStateA implements State {
    @Override
    public void handle(String sampleParameter) {
        System.out.println("A");
    }
}
