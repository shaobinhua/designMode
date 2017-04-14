package com.binhua.bridge.example02.non;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public interface Message {
    /**
     * 发送消息
     * @param message 要发送消息的内容
     * @param toUser  消息的接受者
     */
    public void send(String message , String toUser);
}
