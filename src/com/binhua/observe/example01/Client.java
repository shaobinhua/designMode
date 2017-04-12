package com.binhua.observe.example01;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class Client {
    public static void main(String[] args) {
        //被观察者
        ConSubject subject = new ConSubject();
        //观察者
        Observer observer = new ConObserver();
        //将观察者对象登记到主题对象上
        subject.attach(observer);
        subject.change("new");
    }
}
