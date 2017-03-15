package com.binhua.singleton.doublecheck;

/** 双重检查加锁
 * Created by shaobinhua on 2017/3/15.
 */
public class Singleton {
    /**
     * 需要使用关键字 volatile
     * 被volatile修饰的变量的值，将不会被本地线程缓存，
     * 所有对该变量的读写都是直接操作共享内存，
     * 从而确保多个线程能正确的处理该变量
     */
    private volatile static Singleton instance = null;

    /**
     * 私有化构造器，外部无法通过构造器来创建
     */
    private Singleton() {

    }

    /**
     * 外部通过该静态工厂方法获取实例
     * 没有对该方法加锁
     */
    public static Singleton getInstance() {

        //先检查实例是否存在，如果不存在才进入下面的同步块
        if (null == instance) {
            //此处加锁
            synchronized (Singleton.class) {
                //再次检查实例是否存在，如果不存在才真正的创建实例
                if(instance == null){
                    instance = new Singleton();
                }
            }

        }
        return instance;
    }

}
