package com.binhua.command.example01;

/**客户端角色类
 * Created by shaobinhua on 2017/4/10.
 */
public class Client {

    public static void main(String[] args) {
        //创建命令对象，设定它的接收者
        Command command = new ConcreteCommand(new Receiver());
        //创建请求者，把命令对象设置进去
        Invoker invoker = new Invoker(command);
        //执行方法
        invoker.action();
    }
}
