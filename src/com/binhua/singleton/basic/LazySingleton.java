package com.binhua.singleton.basic;

/** 懒汉
 * Created by shaobinhua on 2017/3/15.
 */
public class LazySingleton {
    /**
     * 不先创建
     */
    private static LazySingleton lazySingleton =null;

    /**
     * 私有化构造器，外部无法通过构造器来创建
     */
    private LazySingleton() {

    }

    /**
     * 外部通过该静态工厂方法获取实例
     */
    public static synchronized LazySingleton getLazySingleton() {

        if (null == lazySingleton) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
