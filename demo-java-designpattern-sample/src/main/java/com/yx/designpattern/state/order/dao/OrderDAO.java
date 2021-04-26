package com.yx.designpattern.state.order.dao;

import com.yx.designpattern.state.order.domain.OrderInfo;

/**
 * @author yangxi
 * @version 1.0
 */
public interface OrderDAO {

    /**
     * 更新订单信息
     * @param orderInfo
     */
    void updateOrder(OrderInfo orderInfo);
}