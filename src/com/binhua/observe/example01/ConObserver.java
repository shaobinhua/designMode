package com.binhua.observe.example01;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class ConObserver implements Observer {

    //观察者的状态
    private String observerState;

    @Override
    public void update(String state) {
        /**
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = state;
        System.out.println("观察者状态为："+observerState);
    }
}
