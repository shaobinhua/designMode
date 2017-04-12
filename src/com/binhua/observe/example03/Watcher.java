package com.binhua.observe.example03;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class Watcher implements Observer {

    public Watcher() {
    }

    public Watcher(Observable o){
        o.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Watcher is "+((Watched)o).getState());
    }
}
