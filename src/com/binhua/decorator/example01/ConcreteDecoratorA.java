package com.binhua.decorator.example01;

/**具体装饰角色
 * Created by shaobinhua on 2017/4/16.
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 写相关的业务代码
        super.operation();
        // 写相关的业务代码
        addBehavior();
    }

    private void addBehavior()
    {
        //your code
    }
}
