package com.binhua.builder.example01;

/** 具体的建造者
 * Created by shaobinhua on 2017/3/26.
 */
public class ConcreteBuilder implements Builder {
    // a product
    private Product cpu = new Product();

    @Override
    public void buildPart1() {
        cpu.setPart1("carBorad 001");
    }

    @Override
    public void buildPart2() {
        cpu.setPart2("avi 001");
    }

    // 返回产品
    @Override
    public Product retrieveResult() {
        return cpu;
    }
}
