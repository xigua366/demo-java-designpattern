package com.yx.designpattern.state.order.component;

import com.yx.designpattern.state.order.domain.OrderInfo;

/**
 * 订单业务操作上下文
 *
 * @author yangxi
 */
public class OrderStateContext {

    //当前状态
    private OrderState currentOrderState;

    public OrderStateContext() {
        // 设置初始状态
        currentOrderState = new WaitPaidOrderState();
    }

    public OrderState getCurrentOrderState() {
        return currentOrderState;
    }

    public void setCurrentOrderState(OrderState currentOrderState) {
        this.currentOrderState = currentOrderState;
    }

    /**
     * 状态机元素二、事件
     *
     * 支付订单
     */
    public void payOrder(OrderInfo orderInfo) {
        currentOrderState.payOrder(this, orderInfo);
    }

    /**
     * 状态机元素二、事件
     *
     * 订单发货
     */
    public void deliver(OrderInfo orderInfo){
        currentOrderState.deliver(this, orderInfo);
    }

    /**
     * 状态机元素二、事件
     *
     * 订单收获签收
     */
    public void receiveGoods(OrderInfo orderInfo){
        currentOrderState.receiveGoods(this, orderInfo);
    }
}