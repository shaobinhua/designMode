package com.binhua.decorator.example02;

/**
 * Created by shaobinhua on 2017/4/16.
 */
public class RubbishManagerC extends Manager {
    public RubbishManagerC(DoProjecter doProjecter) {
        super(doProjecter);
    }

    public void criticism() {
        System.out.println("批评代码工人");
    }
}
