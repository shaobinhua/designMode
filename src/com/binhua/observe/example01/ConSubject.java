package com.binhua.observe.example01;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class ConSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void change(String newState) {
        System.out.println("主题状态为：" + newState);
        //状态发生改变，通知各个观察者
        state=newState;
        this.nodifyObservers(newState);
    }
}
