package com.binhua.builder.example02;

import com.binhua.builder.example02.build.Builder;
import com.binhua.builder.example02.build.WelcomeBuilder;

/**
 * Created by shaobinhua on 2017/4/5.
 */
public class TestClient {
    public static void main(String[] args) {
        Builder welbuilder = new WelcomeBuilder();
        Director WelDirector = new Director(welbuilder);
        WelDirector.construct("shao","zhai");
        //返回产品
        welbuilder.sendMessage();

    }
}
