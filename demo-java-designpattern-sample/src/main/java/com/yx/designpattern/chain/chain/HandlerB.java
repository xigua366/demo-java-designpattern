package com.yx.designpattern.chain.chain;

public class HandlerB extends Handler {

    @Override
    protected void doHandle() {
      System.out.println("handlerB 执行");
    }
}