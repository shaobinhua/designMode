package com.binhua.chain.example02.otherway;

import com.binhua.chain.example02.*;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class Client {
    public static void main(String[] args) {
        Handler generalManager = new ManagerHander("general",5000,null);
        Handler deptManager = new ManagerHander("dept",1000,generalManager);
        Handler projectManager =new ManagerHander("project",500,deptManager);
        System.out.println(projectManager.handlerReq("shao", 120));
        System.out.println(projectManager.handlerReq("shao", 820));
        System.out.println(projectManager.handlerReq("shao", 1120));
    }
}
