package com.binhua.bridge.example02.usebri.abstractmessage;

import com.binhua.bridge.example02.usebri.AbstractMessage;
import com.binhua.bridge.example02.usebri.MessageImplementor;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public class UrgencyMessage extends AbstractMessage {
    public UrgencyMessage(MessageImplementor impl) {
        super(impl);
    }

    @Override
    protected void send(String mess, String user) {
        mess = "urgency"+mess;
        super.send(mess, user);
    }

    /**
     * 扩展自己的新功能，监控某消息的处理状态
     * @param messageId    被监控的消息编号
     * @return    监控到的消息的处理状态
     */
    public Object watch(String messageId) {
        // 根据消息id获取消息的状态，组织成监控的数据对象，然后返回
        return null;
    }
}
