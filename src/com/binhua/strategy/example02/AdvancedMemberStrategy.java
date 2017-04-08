package com.binhua.strategy.example02;

/**
 * Created by shaobinhua on 2017/4/8.
 */
public class AdvancedMemberStrategy implements MemberStrategy{
    @Override
    public double calcPrice(double booksPrice) {
        System.out.println("AdvancedMember has 80% discount");
        return booksPrice*0.8;
    }
}
