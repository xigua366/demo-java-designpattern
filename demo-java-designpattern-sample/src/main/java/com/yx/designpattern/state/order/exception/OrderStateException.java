package com.yx.designpattern.state.order.exception;

/**
 * @author yangxi
 * @version 1.0
 */
public class OrderStateException extends RuntimeException {

    public OrderStateException() {
    }

    public OrderStateException(String message) {
        super(message);
    }

    public OrderStateException(String message, Throwable cause) {
        super(message, cause);
    }

    public OrderStateException(Throwable cause) {
        super(cause);
    }

    public OrderStateException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}