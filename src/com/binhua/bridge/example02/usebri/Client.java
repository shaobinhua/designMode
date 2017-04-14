package com.binhua.bridge.example02.usebri;

import com.binhua.bridge.example02.usebri.abstractmessage.CommonMessage;
import com.binhua.bridge.example02.usebri.messageimp.MessageEmail;
import com.binhua.bridge.example02.usebri.messageimp.MessageSMS;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public class Client {
    public static void main(String[] args) {
        //发送的实现
        MessageImplementor implementorSms = new MessageSMS();
        MessageImplementor implementorEm = new MessageEmail();

        //抽象的业务--普通消息
        AbstractMessage sendComMessSms = new CommonMessage(implementorSms);
        AbstractMessage sendComMessEm = new CommonMessage(implementorEm);
        sendComMessSms.send("普通消息","shao");
        sendComMessEm.send("普通消息","shao");

        //抽象的业务--加急消息
        AbstractMessage sendUrMessSms = new CommonMessage(implementorSms);
        AbstractMessage sendUrMessEm = new CommonMessage(implementorEm);
        sendUrMessSms.send("加急消息","shao");
        sendUrMessEm.send("加急消息","shao");
    }
}
