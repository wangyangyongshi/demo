package com.example.demo.DelayQueue;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.DelayQueue;

/**
 * @author:wangyang
 * @creatDate:2020-03-30
 **/
public class OrderTest {

    private static final DelayQueue<OrderDelay> queue = new DelayQueue<> ();

    public static void main(String[] args) {

        produce (1);
        consum ();

    }


    private static void produce(int orderId) {
        OrderDelay delay = new OrderDelay ();
        delay.setOrderId (orderId);
        Date currentTime = new Date ();
        SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
        String dateString = formatter.format (currentTime);
        delay.setOrderTime (currentTime);
        System.out.printf ("现在时间是%s;订单%d加入队列%n", dateString, orderId);
        queue.put (delay);
    }

    private static void consum() {
        while (true) {
            try {
                OrderDelay orderDelay = queue.take ();//
                Date currentTime = new Date ();
                SimpleDateFormat formatter = new SimpleDateFormat ("yyyy-MM-dd HH:mm:ss");
                String dateString = formatter.format (currentTime);
                System.out.printf ("现在时间是%s;订单%d过期%n", dateString, orderDelay.getOrderId ());
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }


}
