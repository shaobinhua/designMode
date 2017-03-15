package com.binhua.singleton.useenum;

/** 单元素的枚举类型已经成为实现Singleton的最佳方法
 * Created by shaobinhua on 2017/3/16.
 */
public enum Singleton {
    /**
     * 定义一个枚举的元素，它就代表了Singleton的一个实例。
     */
    INSTANCE("jimmy", 1);

    private int id;
    private String name;

    private Singleton(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Singleton getInstance() {
        return INSTANCE;
    }

    @Override
    public String toString() {
        return "name:" + name + " id:" + id;
    }

}
