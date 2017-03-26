package com.binhua.builder.example01;

/** 抽象建造者 方法为所需要的零件和返回该产品
 * 一般有一个产品一个build
 * Created by shaobinhua on 2017/3/26.
 */
public interface Builder {
    public void buildPart1();
    public void buildPart2();
    public Product retrieveResult();
}
