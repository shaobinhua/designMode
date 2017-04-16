package com.binhua.decorator.example02;

/**
 * Created by shaobinhua on 2017/4/16.
 */
public class AnxietyManagerA extends Manager {

    public AnxietyManagerA(DoProjecter doProjecter) {
        super(doProjecter);
    }

    @Override
    public void doEarlyWork() {
        System.out.println("项目经理 在做需求分析");
        System.out.println("项目经理 在做架构设计");
        System.out.println("项目经理 在做详细设计");
    }

    public void urgent() {
        System.out.println("催促代码工人");
    }
}
