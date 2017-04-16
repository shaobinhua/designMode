package com.binhua.states.example01;

/**环境角色类
 * Created by shaobinhua on 2017/4/15.
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void requset(String param) {
        state.handle(param);
    }
}
