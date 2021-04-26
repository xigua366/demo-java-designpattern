package com.yx.designpattern.chain.chain;

public class HandlerA extends Handler {

    @Override
    protected void doHandle() {
      System.out.println("handlerA 执行");
    }
}