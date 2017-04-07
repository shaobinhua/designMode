package com.binhua.chain.example03;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class Client {
    public static void main(String[] args) {
        String req = "test";
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new Test1Filter());
        filterChain.addFilter(new Test2Filter());
        filterChain.doFilter(req);
    }
}
