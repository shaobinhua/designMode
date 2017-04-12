package com.binhua.observe.example03;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class Client {
    public static void main(String[] args) {
        Watched watched = new Watched();

        Watcher watcher = new Watcher();
        //登记观察者
        watched.addObserver(watcher);

        watched.change("no");




    }
}
