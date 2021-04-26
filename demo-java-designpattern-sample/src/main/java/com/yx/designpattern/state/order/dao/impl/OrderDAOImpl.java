package com.yx.designpattern.state.order.dao.impl;

import com.yx.designpattern.state.order.dao.OrderDAO;
import com.yx.designpattern.state.order.domain.OrderInfo;

/**
 * @author yangxi
 * @version 1.0
 */
public class OrderDAOImpl implements OrderDAO {

    @Override
    public void updateOrder(OrderInfo orderInfo) {
        System.out.println("更新订单成功，订单状态为：" + orderInfo.getOrderState());
    }
}