package com.binhua.bridge.example01.abstraction;

import com.binhua.bridge.example01.Abstraction;
import com.binhua.bridge.example01.Implementor;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public class RefinedAbstraction1 extends Abstraction {

    public RefinedAbstraction1(Implementor impl) {
        super(impl);
    }

    //其他的操作方法
    public void otherOperation(){

    }
}
