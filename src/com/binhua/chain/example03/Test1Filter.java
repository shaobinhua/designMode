package com.binhua.chain.example03;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class Test1Filter extends FilterChain  {

    public void doFilter (String req){
        System.out.println("process filter 001");
    }
}
