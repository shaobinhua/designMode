package com.binhua.strategy.example02;

/** 抽象会员打折策略
 * Created by shaobinhua on 2017/4/8.
 */
public interface MemberStrategy {
    /**
     * 计算图书的价格
     * @param booksPrice    图书的原价
     * @return    计算出打折后的价格
     */
    double calcPrice(double booksPrice);
}
