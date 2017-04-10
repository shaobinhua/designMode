package com.binhua.command.example01;

/**
 * 请求者
 * Created by shaobinhua on 2017/4/10.
 */
public class Invoker {

    /**
     * 持有命令对象
     */
    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action() {
        command.executor();
    }
}
