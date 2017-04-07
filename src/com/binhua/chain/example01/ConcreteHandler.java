package com.binhua.chain.example01;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class ConcreteHandler extends Handler {
    /**
     * 处理方法
     */
    @Override
    protected void handlerRequest() {
        if (getSuccessor()!=null) {
            System.out.println("ConcreteHandler no process");
            // 下个Handler处理
            getSuccessor().handlerRequest();
        }else {
            System.out.println("ConcreteHandler process req");
        }

    }
}
