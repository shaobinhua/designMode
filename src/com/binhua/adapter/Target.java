package com.binhua.adapter;

/** 目标角色
 * Created by shaobinhua on 2017/4/6.
 */
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
    void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
    void sampleOperation2();
}
