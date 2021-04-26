package com.yx.designpattern.chain.interceptor;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟spring mvc拦截器，基于数组来存储责任链节点
 *
 * @author yangxi
 * @version 1.0
 */
public class InterceptorChain {

    private List<MvcInterceptor> mvcInterceptorList;

    public InterceptorChain() {
        mvcInterceptorList = new ArrayList<>();
    }

    public void add(MvcInterceptor mvcInterceptor) {
        if(mvcInterceptorList == null) {
            mvcInterceptorList = new ArrayList<>();
        }
        mvcInterceptorList.add(mvcInterceptor);
    }

    public void handler() {
        for (MvcInterceptor mvcInterceptor : mvcInterceptorList) {
            if(!mvcInterceptor.handler()) {
                return;
            }
        }
    }

}