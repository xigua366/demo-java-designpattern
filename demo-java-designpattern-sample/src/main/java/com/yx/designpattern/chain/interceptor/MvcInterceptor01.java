package com.yx.designpattern.chain.interceptor;

/**
 * @author yangxi
 * @version 1.0
 */
public class MvcInterceptor01 implements MvcInterceptor {

    @Override
    public boolean handler() {
        System.out.println("MvcInterceptor01 处理逻辑。。。");
        return true;
    }
}