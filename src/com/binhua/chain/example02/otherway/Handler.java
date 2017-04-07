package com.binhua.chain.example02.otherway;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public abstract class Handler {
    /**
     * 下一个处理请求的对象
     * @return
     */
    protected Handler handler;
    public Handler getHandler() {
        return handler;
    }

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    /**
     * 当前处理人
     */
    protected String manger;
    /**
     * 当前处理人可处理费用
     */
    protected double amount;

    /**
     * 处理聚餐费用的申请
     * @param user    申请人
     * @param fee    申请的钱数
     * @return        成功或失败的具体通知
     */
    protected abstract String handlerReq(String user,double fee);
}
