package com.binhua.builder.example02;

import com.binhua.builder.example02.build.Builder;

/**
 * Created by shaobinhua on 2017/4/5.
 */
public class Director {
    Builder builder ;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct(String from,String to) {
        builder.buildSendDate();
        builder.buildBody();
        builder.buildFrom(from);
        builder.buildSubject();
        builder.buildTo(to);
    }

}
