package com.yx.designpattern.state.order.component;

import com.yx.designpattern.state.order.constant.OrderStateEnum;
import com.yx.designpattern.state.order.dao.OrderDAO;
import com.yx.designpattern.state.order.dao.impl.OrderDAOImpl;
import com.yx.designpattern.state.order.domain.OrderInfo;
import com.yx.designpattern.state.order.exception.OrderStateException;

/**
 *
 * 订单状态的抽象定义
 *
 * @author yangxi
 */
public abstract class AbstractOrderState implements OrderState {

    private OrderDAO orderDAO;

    public AbstractOrderState() {
        this.orderDAO = new OrderDAOImpl();
    }

    public OrderDAO getOrderDAO() {
        return orderDAO;
    }

    /**
     *
     * 支付订单事件，抽象方法中的逻辑
     */
    @Override
    public void payOrder(OrderStateContext orderStateContext, OrderInfo orderInfo) {
        // 判断订单是否能支付
        Integer orderState = orderInfo.getOrderState();
        if(!orderState.equals(OrderStateEnum.WAIT_FOR_PAY.getValue())) {
            throw new OrderStateException("订单不是待支付状态, 不能执行支付操作。 订单当前状态为：" + orderState);
        }
    }

    /**
     *
     * 订单发货事件，抽象方法中的逻辑
     */
    @Override
    public void deliver(OrderStateContext orderStateContext, OrderInfo orderInfo) {
        // 判断订单是否能发货
        Integer orderState = orderInfo.getOrderState();
        if(!orderState.equals(OrderStateEnum.WAIT_FOR_DELIVERY.getValue())) {
            throw new OrderStateException("订单不是待发货状态, 不能执行发货操作。 订单当前状态为：" + orderState);
        }
    }

    /**
     *
     * 订单收货签收事件，抽象方法中的逻辑
     */
    @Override
    public void receiveGoods(OrderStateContext orderStateContext, OrderInfo orderInfo) {
        // 判断订单是否能收货
        Integer orderState = orderInfo.getOrderState();
        if(!orderState.equals(OrderStateEnum.WAIT_FOR_RECEIVE.getValue())) {
            throw new OrderStateException("订单不是待收货状态, 不能执行收货操作。 订单当前状态为：" + orderState);
        }
    }
}