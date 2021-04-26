package com.yx.designpattern.state.order.component;

import com.yx.designpattern.state.order.constant.OrderStateEnum;
import com.yx.designpattern.state.order.domain.OrderInfo;

/**
 * 订单待收货状态组件
 *
 * @author yangxi
 */
public class ReceiveGoodsOrderState extends AbstractOrderState{

    /**
     * 触发执行订单收货操作事件
     *
     * @param orderStateContext
     * @param orderInfo
     */
    @Override
    public void receiveGoods(OrderStateContext orderStateContext, OrderInfo orderInfo) {
        /**
         * 状态机元素三、行为
         */

        // 先检查前置状态
        super.receiveGoods(orderStateContext, orderInfo);

        // 再更新订单状态为交易完成
        orderInfo.setOrderState(OrderStateEnum.FINISHED.getValue());
        this.getOrderDAO().updateOrder(orderInfo);
        System.out.println("订单完成收获，交易结束, state：" + OrderStateEnum.FINISHED);
    }
}