package com.binhua.Template.example02;

/**
 * Created by shaobinhua on 2017/4/9.
 */
public class Client {
    public static void main(String[] args) {
        Account account = new MoneyMarketAccount();
        System.out.println("货币市场账号的利息数额为：" + account.calculateInterest());
        account = new CDAccount();
        System.out.println("定期账号的利息数额为：" + account.calculateInterest());
    }



}
