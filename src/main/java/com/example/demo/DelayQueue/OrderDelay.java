package com.example.demo.DelayQueue;

import java.util.Date;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;

/**
 * @author:wangyang
 * @creatDate:2020-03-30
 **/
public class OrderDelay implements Delayed {

    private int orderId;

    private Date orderTime;

    private static final int expireTime = 15000;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    @Override
    public long getDelay(TimeUnit unit) {
        return orderTime.getTime () + expireTime - System.currentTimeMillis ();
    }

    @Override
    public int compareTo(Delayed o) {
        return this.orderTime.getTime () - ((OrderDelay) o).orderTime.getTime () > 0 ? 1 : -1;
    }


    @Override
    public String toString() {
        return "orderId====>" + orderId + "orderTime=====>" + orderTime;
    }
}
