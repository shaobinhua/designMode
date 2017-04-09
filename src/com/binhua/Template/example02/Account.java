package com.binhua.Template.example02;

/** 抽象模板角色类
 * Created by shaobinhua on 2017/4/9.
 */
public abstract class Account {
    //方法用final修饰
    public final double calculateInterest(){
        //获取账户类型
        String accountType = doCalculateAccountType();
        //获取利息百分比
        double interestRate = doCalculateInterestRate();

        //获取账户资金
        double amount = calculateAmount(accountType);

        return amount * interestRate;
    }

    /**
     * 基本方法，已经实现
     */
    private double calculateAmount(String accountType) {
        return 500;
    }

    /**
     * 基本方法留给子类实现
     */
    protected abstract double doCalculateInterestRate();

    /**
     * 基本方法留给子类实现
     */
    protected abstract String doCalculateAccountType();
}
