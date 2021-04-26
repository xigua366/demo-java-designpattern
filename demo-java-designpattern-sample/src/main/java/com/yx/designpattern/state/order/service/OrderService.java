package com.yx.designpattern.state.order.service;

import com.yx.designpattern.state.order.domain.OrderInfo;

/**
 * 订单管理 Service 组件
 * @author yangxi
 * @version 1.0
 */
public interface OrderService {

    void payOrder(OrderInfo orderInfo);

    void deliver(OrderInfo orderInfo);

    void receiveGoods(OrderInfo orderInfo);

}