package com.binhua.chain.example02.otherway;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class ManagerHander extends Handler {

    public ManagerHander(String manger, double amount, Handler handler) {
        this.manger = manger;
        this.amount = amount;
        this.handler = handler;
    }

    @Override
    protected String handlerReq(String user, double fee) {
        String msg = "";
        if (fee < this.amount) {
            if ("shao".equals(user)) {
                msg = this.manger +"give shao " + fee;
            } else {
                msg = "only shao can get money";
            }
        } else {
            msg = getHandler().handlerReq(user, fee);
        }
        return msg;
    }
}
