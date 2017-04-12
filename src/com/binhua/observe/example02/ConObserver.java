package com.binhua.observe.example02;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class ConObserver implements Observer {

    private String observerState;

    @Override
    public void update(Subject subject) {
         /*
         * 更新观察者的状态，使其与目标的状态保持一致
         */
        observerState = ((ConSubject)subject).getState();
        System.out.println("观察者状态为："+observerState);
    }
}
