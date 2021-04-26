package com.yx.designpattern.chain.filter;

/**
 * @author yangxi
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {
        Filter01 filter01 = new Filter01();
        Filter02 filter02 = new Filter02();
        Filter03 filter03 = new Filter03();

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(filter01);
        filterChain.addFilter(filter02);
        filterChain.addFilter(filter03);
        filterChain.doFilter();

    }

}