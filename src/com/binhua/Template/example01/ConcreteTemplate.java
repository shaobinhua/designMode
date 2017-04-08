package com.binhua.Template.example01;

/**具体模板角色类，实现了父类所声明的基本方法
 * Created by shaobinhua on 2017/4/8.
 */
public class ConcreteTemplate extends AbstractTemplate {

    //基本方法的实现
    @Override
    protected void abstractMethod() {
        System.out.println("process ConcreteTemplate.java");
    }

    //重写父类的方法(可不实现)
    @Override
    public void doHookMethod() {
        System.out.println("process ConcreteTemplate.doHookMethod()");
    }
}
