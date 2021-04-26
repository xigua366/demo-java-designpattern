package com.yx.designpattern.state.order.constant;

/**
 * 订单状态
 * @author yangxi
 *
 */
public enum OrderStateEnum {

	// 订单状态，1：待付款，2：已取消，3：待发货，4：待收货，5：已完成，6：售后中（退货申请待审核），7：交易关闭（退货审核不通过），8：交易中（待寄送退货商品），9：售后中（退货商品待收货），10：售后中（退货待入库），11：（1）售后中（退货已入库），12：交易关闭（完成退款）

	/**
	 * 未知状态
	 */
	UNKNOWN(-1),

	/**
	 * 待付款
	 */
	WAIT_FOR_PAY(1),

	/**
	 * 已取消
	 */
	CANCELED(2),

	/**
	 * 待发货
	 */
	WAIT_FOR_DELIVERY(3),

	/**
	 * 待收货
	 */
	WAIT_FOR_RECEIVE(4),

	/**
	 * 已完成
	 */
	FINISHED(5),

	/**
	 * 退货申请待审核
	 */
	WAIT_FOR_RETURN_GOODS_APPROVE(6),

	/**
	 * 退货审核不通过
	 */
	RETURN_GOODS_REJECTED(7),

	/**
	 * 退货商品待寄送
	 */
	WAIT_FOR_SEND_OUT_RETURN_GOODS(8),

	/**
	 * 退货商品待收货
	 */
	WAIT_FOR_RECEIVE_RETURN_GOODS(9),

	/**
	 * 退货商品待入库
	 */
	WAIT_FOR_INPUT_RETURN_GOODS(10),

	/**
	 * 退货商品已入库
	 */
	FINISHED_INPUT_RETURN_GOODS(11),

	/**
	 * 完成退货商品退款
	 */
	FINISHED_REFUND(12);


	private Integer value;

	OrderStateEnum(Integer value) {
		this.value = value;
	}

	public Integer getValue() {
		return this.value;
	}
}
