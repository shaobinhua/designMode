package com.binhua.decorator.example01;

/**具体装饰角色
 * Created by shaobinhua on 2017/4/16.
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        super.operation();
    }
}
