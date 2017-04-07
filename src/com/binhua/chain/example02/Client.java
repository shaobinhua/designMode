package com.binhua.chain.example02;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class Client {
    public static void main(String[] args) {
        Handler projectManager = new ProjectManager();
        Handler deptManager = new DeptManager();
        Handler generalManager = new GeneralManager();
        projectManager.setHandler(deptManager);
        deptManager.setHandler(generalManager);
        System.out.println(projectManager.handlerReq("shao", 300));
        System.out.println(projectManager.handlerReq("shao", 800));
        System.out.println(projectManager.handlerReq("shao", 1500));

    }
}
