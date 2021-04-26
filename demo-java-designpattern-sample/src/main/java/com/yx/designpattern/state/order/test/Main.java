package com.yx.designpattern.state.order.test;

import com.yx.designpattern.state.order.constant.OrderStateEnum;
import com.yx.designpattern.state.order.domain.OrderInfo;
import com.yx.designpattern.state.order.service.impl.OrderServiceImpl;

import java.math.BigDecimal;
import java.util.Date;
import java.util.UUID;

/**
 * 测试main方法
 * @author yangxi
 */
public class Main {

    /**
     * 测试类入口，实际项目中表示Controller入口
     * @param args
     */
    public static void main(String[] args) {

        OrderInfo orderInfo = initOrderInfo();

        OrderServiceImpl orderService = new OrderServiceImpl();

        // 订单状态依次是支付、发货、签收， 如果调整以下三个方法的调用顺序，会触发状态错误异常
        orderService.payOrder(orderInfo);
        orderService.deliver(orderInfo);
        orderService.receiveGoods(orderInfo);

        /**
         * 状态模式实现状态机总结：
         * 要点1：状态机三点主要内容，状态、事件、行为
         * 状态就是一个个的具体的State实现类。
         * 事件就是State接口中的一个个方法
         * 行为就是一个个State实现类中的实现方法中的业务逻辑代码
         *
         * 要点2：状态机最主要的工作时对源对象的状态进行判断与控制，然后就是完成一个状态后要设置后续要处理的状态组件
         * State接口事件的实现方法中，进行行为操作之前都要对前置状态进行判断，符合条件的状态才能进行行为操作。
         * 为了实现状态行为之间的连贯性，需要一个Context山下文组件来协调控制State状态组件
         * 为了不让Context上下文组件依赖State状态组件，然后State状态组件又依赖Context上下文组件，可以把Context上下文组件作为State状态中各个事件方法的一个参数进行传递
         * State事件方法中执行完一个行为之后，要设计Context持有的State组件为下一个状态组件
         * 对源对象的前置状态判断工作，可以抽象到一个AbstractState中去完成
         *
         */

    }

    /**
     * 初始化订单
     * @return
     */
    public static OrderInfo initOrderInfo() {
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setId(10001L);
        orderInfo.setOrderNo(UUID.randomUUID().toString().toUpperCase().replace("-", ""));
        orderInfo.setOrderAmt(BigDecimal.TEN);


        orderInfo.setUsername("zhangsan");
        orderInfo.setOrderState(OrderStateEnum.WAIT_FOR_PAY.getValue()); // 初始为待支付状态
        orderInfo.setCreatedTime(new Date());
        orderInfo.setUpdatedTime(new Date());

        return orderInfo;
    }
}