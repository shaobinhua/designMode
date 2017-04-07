package com.binhua.chain.example02;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public abstract class Handler {
    /**
     * 下一个处理请求的对象
     * @return
     */
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    protected Handler handler;

    /**
     * 处理聚餐费用的申请
     * @param user    申请人
     * @param fee    申请的钱数
     * @return        成功或失败的具体通知
     */
    protected abstract String handlerReq(String user,double fee);
}
