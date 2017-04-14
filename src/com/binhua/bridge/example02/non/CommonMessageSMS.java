package com.binhua.bridge.example02.non;

/** 普通短信消息
 * Created by shaobinhua on 2017/4/14.
 */
public class CommonMessageSMS implements Message {

    @Override
    public void send(String message, String toUser) {

        System.out.println("使用系统内短消息的方法，发送消息'"+message+"'给"+toUser);
    }

}