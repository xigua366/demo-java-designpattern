package com.yx.designpattern.chain.filter;

/**
 * @author yangxi
 * @version 1.0
 */
public interface Filter {

    boolean doFilter(FilterChain filterChain);

}