package com.binhua.observe.example01;

/**
 * Created by shaobinhua on 2017/4/12.
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    void update(String state);
}
