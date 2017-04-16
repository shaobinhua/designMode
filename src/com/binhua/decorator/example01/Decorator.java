package com.binhua.decorator.example01;

/**装饰角色
 * Created by shaobinhua on 2017/4/16.
 */
public class Decorator implements Component {
    //实际上存放的是具体构建
    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        // 委派给构件
        component.operation();
    }
}
