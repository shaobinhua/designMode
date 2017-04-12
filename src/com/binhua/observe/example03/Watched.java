package com.binhua.observe.example03;

import java.util.Observable;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public class Watched extends Observable {
    private String state = "ok";

    public String getState() {
        return state;
    }

    public void change(String state) {
        if ( this.state!=state) {
            this.state=state;
            System.out.println("Watched is " + state);
            setChanged();
        }

        notifyObservers();
    }
}
