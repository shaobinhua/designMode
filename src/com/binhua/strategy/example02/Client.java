package com.binhua.strategy.example02;

/**
 * Created by shaobinhua on 2017/4/8.
 */
public class Client {
    public static void main(String[] args) {
        MemberStrategy strategy = new AdvancedMemberStrategy();
        Price price = new Price(strategy);
        double clue = price.getPrice(50);
        System.out.println(clue);
    }
}
