package com.binhua.singleton.holderclass;

/** 使用静态内部类加载模式来延迟初始化
 * Created by shaobinhua on 2017/3/16.
 */
public class Singleton {
    /**
     * 私有化构造器，外部无法通过构造器来创建
     */
    private Singleton() {

    }

    /**
     * 类级的内部类，也就是静态的成员式内部类，
     * 该内部类的实例与外部类的实例没有绑定关系，
     * 而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton instance = new Singleton();
    }

    /**
     * 外部通过该静态工厂方法获取实例
     */
    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }


}
