package com.binhua.Template.example02;

/**
 * Created by shaobinhua on 2017/4/9.
 */
public class CDAccount extends Account {
    @Override
    protected double doCalculateInterestRate() {
        return 0.08;
    }

    @Override
    protected String doCalculateAccountType() {
        return  "Certificate of Deposite";
    }
}
