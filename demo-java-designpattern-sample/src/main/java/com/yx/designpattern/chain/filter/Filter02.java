package com.yx.designpattern.chain.filter;

/**
 * @author yangxi
 * @version 1.0
 */
public class Filter02 implements Filter {

    @Override
    public boolean doFilter(FilterChain filterChain) {
        System.out.println("filter02 执行");
        filterChain.doFilter();
        return true;
    }
}