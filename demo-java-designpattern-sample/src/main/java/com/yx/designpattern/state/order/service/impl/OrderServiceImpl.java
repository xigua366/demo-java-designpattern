package com.yx.designpattern.state.order.service.impl;

import com.yx.designpattern.state.order.component.OrderStateContext;
import com.yx.designpattern.state.order.domain.OrderInfo;
import com.yx.designpattern.state.order.service.OrderService;

/**
 * @author yangxi
 * @version 1.0
 */
public class OrderServiceImpl implements OrderService {

    private OrderStateContext orderStateContext = new OrderStateContext();

    @Override
    public void payOrder(OrderInfo orderInfo) {
        orderStateContext.payOrder(orderInfo);

        // do other things
    }

    @Override
    public void deliver(OrderInfo orderInfo) {
        orderStateContext.deliver(orderInfo);

        // do other things
    }

    @Override
    public void receiveGoods(OrderInfo orderInfo) {
        orderStateContext.receiveGoods(orderInfo);

        // do other things
    }
}