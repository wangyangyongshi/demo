package com.example.demo.design;

/**
 * @author:wangyang
 * @creatDate:2020-06-22
 **/
public class StateContext {

    private OrderState orderState;

    public StateContext(OrderState orderState) {
        this.orderState = orderState;
    }

    public void switchStateOrder() {
        orderState.orderService();
    }
}
