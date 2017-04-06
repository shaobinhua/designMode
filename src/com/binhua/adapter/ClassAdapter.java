package com.binhua.adapter;

/** 类适配器角色Adapter扩展了Adaptee,
 * 同时又实现了目标(Target)接口
 * Created by shaobinhua on 2017/4/6.
 */
public class ClassAdapter extends Adaptee implements Target {

    /**
     * 由于源类Adaptee没有方法sampleOperation2()
     * 因此适配器补充上这个方法
     */
    @Override
    public void sampleOperation2() {

    }
}
