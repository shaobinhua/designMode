package com.binhua.bridge.example02.non;

/** 普通邮件消息
 * Created by shaobinhua on 2017/4/14.
 */
public class CommonMessageEmail implements Message{

    @Override
    public void send(String message, String toUser) {

        System.out.println("使用邮件短消息的方法，发送消息'"+message+"'给"+toUser);
    }

}
