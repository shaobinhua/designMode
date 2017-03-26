package com.binhua.builder.example01;

/** 使用具体建造者角色以创建产品对象
 * Created by shaobinhua on 2017/3/26.
 */
public class Director {
    //持有当前的建造者对象
    private Builder builder;

    /**
     * 构造方法，传入建造者对象
     * @param builder 建造器对象
     */
    public Director(Builder builder) {
        this.builder = builder;
    }

    /**
     * 产品构造方法，负责调用各个零件建造方法,来进行创建产品
     */
    public void construct(){
        builder.buildPart1();
        builder.buildPart2();
    }
}
