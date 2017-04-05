package com.binhua.builder.example01;

/**
 * Created by shaobinhua on 2017/3/26.
 */
public class TestClient {
    public static void main(String[] args) {
        //创建建造者
        Builder builder = new ConcreteBuilder();
        //创建导演者并将建造者给导演者
        Director director = new Director(builder);
        //导演者创建产品，客户端并不知道如何创建
        director.construct();
        //获取产品
        Product productCpu = builder.retrieveResult();
        System.out.println(productCpu.getPart1());
        System.out.println(productCpu.getPart2());

    }
}
