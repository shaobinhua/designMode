package com.binhua.bridge.example02.usebri.abstractmessage;

import com.binhua.bridge.example02.usebri.AbstractMessage;
import com.binhua.bridge.example02.usebri.MessageImplementor;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public class CommonMessage extends AbstractMessage {
    public CommonMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    protected void send(String mess, String user) {
        super.send(mess, user);
    }
}
