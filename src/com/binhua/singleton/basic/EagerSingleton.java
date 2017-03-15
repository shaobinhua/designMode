package com.binhua.singleton.basic;

/** 饿汉
 * Created by shaobinhua on 2017/3/15.
 */
public class EagerSingleton {

    /**
     * 这个类被加载时，静态变量instance会被初始化，调用私有构造器，创建实例
     */
    private static EagerSingleton eagerSingleton = new EagerSingleton();

    /**
     * 私有化构造器，外部无法通过构造器来创建
     */
    private EagerSingleton() {

    }

    /**
     * 外部通过该静态工厂方法获取实例
     */
    public static EagerSingleton getInstance(){
        return eagerSingleton;
    }
}
