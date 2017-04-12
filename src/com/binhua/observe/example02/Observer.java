package com.binhua.observe.example02;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public interface Observer {

    //拉模型通常都是把主题对象当做参数传递
    void update( Subject subject );
}
