package com.binhua.strategy.example02;

/**
 * Created by shaobinhua on 2017/4/8.
 */
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("IntermediateMember has 90% discount");
        return booksPrice*0.9;
    }
}
