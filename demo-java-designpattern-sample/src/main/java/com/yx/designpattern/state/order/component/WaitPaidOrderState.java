package com.yx.designpattern.state.order.component;

import com.yx.designpattern.state.order.constant.OrderStateEnum;
import com.yx.designpattern.state.order.domain.OrderInfo;

/**
 * 订单待支付状态组件
 * @author yangxi
 */
public class WaitPaidOrderState extends AbstractOrderState {

    /**
     * 触发执行订单支付操作事件，相当于待支付的状态绑定了支付行为
     *
     * @param orderInfo
     */
    @Override
    public void payOrder(OrderStateContext orderStateContext, OrderInfo orderInfo) {
        /**
         * 状态机元素三、行为
         */

        // 先检查前置状态
        super.receiveGoods(orderStateContext, orderInfo);

        // 再更新订单状态为待发货
        orderInfo.setOrderState(OrderStateEnum.WAIT_FOR_DELIVERY.getValue());
        this.getOrderDAO().updateOrder(orderInfo);
        System.out.println("支付成功，订单进入待发货状态, state：" + OrderStateEnum.WAIT_FOR_DELIVERY);
        // 切换订单上下文状态属性为下一步操作的状态，下一步为待发货
        orderStateContext.setCurrentOrderState(new WaitDeliverOrderState());
    }
}