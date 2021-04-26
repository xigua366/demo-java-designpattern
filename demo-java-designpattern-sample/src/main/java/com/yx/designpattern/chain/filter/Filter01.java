package com.yx.designpattern.chain.filter;

/**
 * @author yangxi
 * @version 1.0
 */
public class Filter01 implements Filter {

    @Override
    public boolean doFilter(FilterChain filterChain) {
        System.out.println("filter01 执行");
        filterChain.doFilter();
        return true;
    }
}