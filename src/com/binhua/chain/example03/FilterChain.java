package com.binhua.chain.example03;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by shaobinhua on 2017/4/7.
 */
public class FilterChain {
    public List<FilterChain> filterChains = new ArrayList<>();

    public void addFilter(FilterChain filterChain) {
        filterChains.add(filterChain);
    }

    protected void doFilter(String request) {
        for (FilterChain filter : filterChains) {
            filter.doFilter(request);
        }

    }
}
