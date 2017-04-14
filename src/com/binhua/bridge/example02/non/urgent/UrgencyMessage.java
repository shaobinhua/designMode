package com.binhua.bridge.example02.non.urgent;

import com.binhua.bridge.example02.non.Message;

/**
 * Created by shaobinhua on 2017/4/14.
 */
public interface UrgencyMessage extends Message {
    /**
     * 监控指定消息的处理过程
     * @param messageId  被监控的消息编号
     * @return    监控到的消息的处理状态
     */
     Object watch(String messageId);
}
