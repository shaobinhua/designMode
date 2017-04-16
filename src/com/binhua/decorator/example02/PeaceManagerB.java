package com.binhua.decorator.example02;

/**
 * Created by shaobinhua on 2017/4/16.
 */
public class PeaceManagerB extends Manager {
    public PeaceManagerB(DoProjecter doProjecter) {
        super(doProjecter);
    }

    /**
     * 项目经理自己的事情：做早期工作
     */
    public void doEarlyWork() {
        System.out.println("项目经理 在做需求分析");
        System.out.println("项目经理 在做详细设计");
    }

    /**
     * 项目经理做收尾工作
     */
    public void doEndWork() {
        System.out.println("项目经理 在做收尾工作");
    }
}
