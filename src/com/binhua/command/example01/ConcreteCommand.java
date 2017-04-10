package com.binhua.command.example01;

/**具体命令类
 * Created by shaobinhua on 2017/4/10.
 */
public class ConcreteCommand implements Command {
    //接收者
    Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    //执行方法
    @Override
    public void executor() {
        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
        receiver.action();
    }
}
