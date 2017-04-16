package com.binhua.states.example01;

/**抽象状态类
 * Created by shaobinhua on 2017/4/15.
 */
public interface State {
    /**
     * 状态对应的处理
     */
    void handle(String sampleParameter);
}
