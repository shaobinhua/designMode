package com.binhua.chain.example01;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class SuccessHandler extends Handler {

    @Override
    protected void handlerRequest() {
        if (getSuccessor()!=null) {
            System.out.println("SuccessHandler no process");
            // 下个Handler处理
            getSuccessor().getSuccessor();
        }else {
            System.out.println("SuccessHandler process req");
        }
    }
}
