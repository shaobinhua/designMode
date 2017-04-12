package com.binhua.observe.example01;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public abstract class Subject {
    /**
     * 用来保存注册的观察者对象
     */
    private List<Observer> observeList = new ArrayList<>();

    /**
     * 注册观察者对象
     * @param observer    观察者对象
     */
    public void attach(Observer observer) {
        observeList.add(observer);
        System.out.println("add observer");
    }

    /**
     * 删除观察者对象
     * @param observer    观察者对象
     */
    public void remoce(Observer observer) {
        observeList.remove(observer);
        System.out.println("remove observer");
    }

    /**
     * 通知所有注册的观察者对象
     */
    public void nodifyObservers(String newState){

        for(Observer observer : observeList){
            observer.update(newState);
        }
    }
}
