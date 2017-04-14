package com.binhua.bridge.example02.usebri.messageimp;

import com.binhua.bridge.example02.usebri.MessageImplementor;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public class MessageSMS implements MessageImplementor {
    @Override
    public void send(String message, String toUser) {
        System.out.println("User sms send ["+message+"] to ["+toUser+"]");
    }
}
