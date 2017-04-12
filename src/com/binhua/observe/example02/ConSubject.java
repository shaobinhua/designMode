package com.binhua.observe.example02;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class ConSubject extends Subject {

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    //调用通知观察者的方法的时候，不需要传入参数了
    public void change(String newState) {
        this.nodifyObservers();
    }
}
