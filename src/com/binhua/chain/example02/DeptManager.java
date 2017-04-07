package com.binhua.chain.example02;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class DeptManager extends Handler {
    @Override
    protected String handlerReq(String user, double fee) {
        String msg = "";
        if (fee < 1000) {
            if ("shao".equals(user)) {
                msg = "DeptManager give shao "+fee;
            } else {
                msg = "only shao can get money";
            }
        } else {
            msg = getHandler().handlerReq(user, fee);
        }
        return msg;
    }
}
