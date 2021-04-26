package com.yx.designpattern.state.order.component;

import com.yx.designpattern.state.order.constant.OrderStateEnum;
import com.yx.designpattern.state.order.domain.OrderInfo;

/**
 * 订单待发货状态组件
 *
 * @author yangxi
 */
public class WaitDeliverOrderState extends AbstractOrderState {

    /**
     * 触发执行订单发货操作事件
     *
     * @param orderStateContext
     * @param orderInfo
     */
    @Override
    public void deliver(OrderStateContext orderStateContext, OrderInfo orderInfo) {
        /**
         * 状态机元素三、行为
         */

        // 先检查前置状态
        super.receiveGoods(orderStateContext, orderInfo);

        // 再更新订单状态为待收货
        orderInfo.setOrderState(OrderStateEnum.WAIT_FOR_RECEIVE.getValue());
        this.getOrderDAO().updateOrder(orderInfo);
        System.out.println("商品已发货并送达目的地，订单进入待收货状态, state：" + OrderStateEnum.WAIT_FOR_RECEIVE);
        // 切换订单上下文状态属性为下一步操作的状态，下一步为待收货
        orderStateContext.setCurrentOrderState(new ReceiveGoodsOrderState());
    }
}