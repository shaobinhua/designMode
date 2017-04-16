package com.binhua.decorator.example02;

/**装饰(Decorator)角色
 * Created by shaobinhua on 2017/4/16.
 */
public class Manager implements DoProjecter {
    //实际上存放的是具体构建
    private DoProjecter doProjecter;

    public Manager(DoProjecter doProjecter) {
        this.doProjecter = doProjecter;
    }

    @Override
    public void doCoding() {
        //项目经理开始新的工作
        startNewWork();
    }
    /**
     * 模板：定义项目经理自己的事情
     */
    public void startNewWork() {
        //项目经理在做早期工作
        doEarlyWork();
        //项目经理很牛，做完需求和设计后，直接将编码委派给代码工人干
        doProjecter.doCoding();
        //项目经理在做收尾工作
        doEndWork();
    }

    /**
     * 项目经理自己的事情：做早期工作
     */
    public void doEarlyWork() {
    }

    /**
     * 项目经理做收尾工作
     */
    public void doEndWork() {
    }
}
