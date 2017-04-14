package com.binhua.bridge.example02.usebri;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public abstract class AbstractMessage {
   protected MessageImplementor impl;

    public AbstractMessage(MessageImplementor impl) {
        this.impl = impl;
    }

    protected void send(String mess,String user) {
        impl.send(mess,user);
    }
}
