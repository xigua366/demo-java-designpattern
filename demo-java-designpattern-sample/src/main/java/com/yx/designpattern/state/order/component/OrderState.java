package com.yx.designpattern.state.order.component;

import com.yx.designpattern.state.order.domain.OrderInfo;

/**
 *
 * 状态机元素一、状态
 *
 * @author yangxi
 * @version 1.0
 */
public interface OrderState {

    /**
     * 状态机元素二、事件
     *
     * 支付订单
     */
    void payOrder(OrderStateContext orderStateContext, OrderInfo orderInfo);

    /**
     * 状态机元素二、事件
     *
     * 订单发货
     */
    void deliver(OrderStateContext orderStateContext, OrderInfo orderInfo);

    /**
     * 状态机元素二、事件
     *
     * 订单收获签收
     */
    void receiveGoods(OrderStateContext orderStateContext, OrderInfo orderInfo);
}