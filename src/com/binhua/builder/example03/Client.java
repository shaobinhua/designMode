package com.binhua.builder.example03;

/**
 * Created by shaobinhua on 2017/4/5.
 */
public class Client {
    public static void main(String[] args) {
        InsuranceContract.ConcreteBuilder builder = new InsuranceContract.ConcreteBuilder("1245",123,456);

        InsuranceContract insuranceContract =builder.setCompanyName("test").setOtherData("tg").build();

        insuranceContract.someOperation();
    }
}
