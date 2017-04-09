package com.binhua.Template.example02;

/**
 * Created by shaobinhua on 2017/4/9.
 */
public class MoneyMarketAccount extends Account {
    @Override
    protected double doCalculateInterestRate() {
        return 0.031;
    }

    @Override
    protected String doCalculateAccountType() {
        return "Money Market";
    }
}
