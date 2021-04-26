package com.yx.designpattern.chain.chain;

/**
 * 基于链表来组装Handler链条
 */
public class HandlerChain {
    private Handler head = null;
    private Handler tail = null;

    public void addHandler(Handler handler) {
      handler.setSuccessor(null);

      if (head == null) {
        head = handler;
        tail = handler;
        return;
      }

      tail.setSuccessor(handler);
      tail = handler;
    }

    public void handle() {
      if (head != null) {
        head.handle();
      }
    }

}