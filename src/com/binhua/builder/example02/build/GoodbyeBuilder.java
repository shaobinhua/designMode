package com.binhua.builder.example02.build;

import com.binhua.builder.example02.product.GoodbyeMessage;

/**
 * Created by shaobinhua on 2017/4/5.
 */
public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setBody("欢送内容");
    }

    @Override
    public void buildBody() {
           msg.setSubject("欢送标题");
    }
}
