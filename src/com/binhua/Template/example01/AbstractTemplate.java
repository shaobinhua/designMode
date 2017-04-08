package com.binhua.Template.example01;

/**抽象模板角色类
 * Created by shaobinhua on 2017/4/8.
 */
public abstract class AbstractTemplate {

    /**
     * 模板方法
     */
    public void templateMethod() {
        //调用基本方法
        abstractMethod();
        doHookMethod();
        concreteMethod();
    }

    /**
     * 基本方法（已经实现） 私有的
     */
    private void concreteMethod() {
        System.out.println("method end");
    }

    /**
     * 基本方法(空方法)
     * 可选择实现的逻辑
     */
    protected  void doHookMethod() {
    }

    /**
     * 基本方法的声明
     * 强制子类实现的剩余逻辑
     */
    protected abstract void abstractMethod();

}
