package com.yx.designpattern.chain.interceptor;

/**
 * @author yangxi
 * @version 1.0
 */
public class MvcInterceptor02 implements MvcInterceptor {

    @Override
    public boolean handler() {
        System.out.println("MvcInterceptor02 处理逻辑。。。");
        return true;
    }
}