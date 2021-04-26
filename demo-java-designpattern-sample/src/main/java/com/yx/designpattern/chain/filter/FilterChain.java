package com.yx.designpattern.chain.filter;

import java.util.ArrayList;
import java.util.List;

/**
 * 基于递归调用的方式来组装过滤器链条
 * @author yangxi
 * @version 1.0
 */
public class FilterChain {

    /**
     * 注册的过滤器
     */
    private List<Filter> filters;

    /**
     * FilterChain 对象不是单例的，所以不存在多线程安全问题
     */
    private int index;

    public FilterChain() {
        filters = new ArrayList<>();
        index = 0;
    }

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void doFilter() {
        if(index < filters.size()) {
            Filter filter = filters.get(index++);
            // 递归调用
            filter.doFilter(this);
        }

    }

}