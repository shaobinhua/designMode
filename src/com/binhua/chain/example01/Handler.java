package com.binhua.chain.example01;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public abstract class Handler {
    /**
     * 实际的处理方法
     */
    protected abstract void handlerRequest();

    /**
     * 后续的责任对象
     */
    protected Handler successor;


    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }


}
