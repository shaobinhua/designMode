package com.binhua.strategy.example01;

/**环境角色类
 * Created by shaobinhua on 2017/4/8.
 */
public class Context {

    //持有一个Strategy的引用
    private Strategy strategy;

    /**
     * 构造函数，传入一个具体策略对象
     * @param strategy    具体策略对象
     */
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 策略方法
     */
    public void contextInterface(){
        strategy.strategyInterface();
    }
}
