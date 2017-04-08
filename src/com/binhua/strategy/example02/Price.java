package com.binhua.strategy.example02;

/**
 * Created by shaobinhua on 2017/4/8.
 */
public class Price {
    /**
     * 引用策略
     */
    private MemberStrategy memberStrategy;

    public Price(MemberStrategy memberStrategy) {
        this.memberStrategy = memberStrategy;
    }

    /**
     *  使用策略
     * @param price 价格
     * @return
     */
    public double getPrice(double price) {
        return memberStrategy.calcPrice(price);
    }
}
