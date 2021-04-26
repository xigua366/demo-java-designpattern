package com.yx.designpattern.chain.interceptor;

/**
 * @author yangxi
 * @version 1.0
 */
public class Test {

    public static void main(String[] args) {

        MvcInterceptor01 mvcInterceptor01 = new MvcInterceptor01();
        MvcInterceptor02 mvcInterceptor02 = new MvcInterceptor02();
        MvcInterceptor03 mvcInterceptor03 = new MvcInterceptor03();

        InterceptorChain chain = new InterceptorChain();
        chain.add(mvcInterceptor01);
        chain.add(mvcInterceptor02);
        chain.add(mvcInterceptor03);

        chain.handler();

    }

}