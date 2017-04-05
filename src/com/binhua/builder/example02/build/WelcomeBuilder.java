package com.binhua.builder.example02.build;

import com.binhua.builder.example02.product.WelcomeMessage;

public class WelcomeBuilder extends Builder {

    public WelcomeBuilder() {
        msg = new WelcomeMessage();
    }

    @Override
    public void buildSubject() {
        msg.setBody("欢迎内容");
    }

    @Override
    public void buildBody() {
       msg.setSubject("欢迎标题");
    }
}