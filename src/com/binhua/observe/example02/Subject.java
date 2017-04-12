package com.binhua.observe.example02;

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
     * 拉模型的抽象主题类主要的改变是nodifyObservers()方法。
     * 在循环通知观察者的时候，也就是循环调用观察者的update()方法的时候，传入的参数不同了
     */
    public void nodifyObservers(){

        for(Observer observer : observeList){
            observer.update(this);
        }
    }
}
