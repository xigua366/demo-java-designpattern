package com.yx.designpattern.chain.filter;

/**
 * @author yangxi
 * @version 1.0
 */
public class Filter03 implements Filter {

    @Override
    public boolean doFilter(FilterChain filterChain) {
        System.out.println("filter03 执行");
        filterChain.doFilter();
        return true;
    }
}