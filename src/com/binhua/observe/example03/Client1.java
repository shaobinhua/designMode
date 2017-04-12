package com.binhua.observe.example03;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class Client1 {
    public static void main(String[] args) {
        Watched watched = new Watched();

        Watcher watcher = new Watcher();
        //登记被观察者
        Watcher watcher1 = new Watcher(watched);

        watched.change("no");
    }
}
