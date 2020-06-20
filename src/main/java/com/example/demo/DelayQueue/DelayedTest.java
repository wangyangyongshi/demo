package com.example.demo.DelayQueue;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.DelayQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * @author:wangyang
 * @creatDate:2020-03-31
 **/
public class DelayedTest {


    public static void main(String[] args) {
        // TODO Auto-generated method stub

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//
//        //定义延迟队列
//        DelayQueue<DelayedTask> delayQueue = new DelayQueue<DelayedTask>();
//
//        //定义三个延迟任务
//        DelayedTask task1 = new DelayedTask(10);
//        DelayedTask task2 = new DelayedTask(5);
//        DelayedTask task3 = new DelayedTask(15);
//
//        delayQueue.add(task1);
//        delayQueue.add(task2);
//        delayQueue.add(task3);
//
//        System.out.println(sdf.format(new Date ()) + " start");
//
//        while (delayQueue.size() != 0) {
//
//            //如果没到时间，该方法会返回
//            DelayedTask task = delayQueue.poll();
//
//            if (task != null) {
//                Date now = new Date();
//                System.out.println(sdf.format(now));
//            }
//
//            try {
//                Thread.sleep(1000);
//            } catch (InterruptedException e) {
//                e.printStackTrace ();
//            }
//        }

        ScheduledExecutorService executor = Executors.newScheduledThreadPool(100);

        for (int i = 10; i > 0; i--) {
            executor.schedule(new Runnable() {

                public void run() {
                    // TODO Auto-generated method stub
                    System.out.println(
                            "Work start, thread id:" + Thread.currentThread().getId() + " " + sdf.format(new Date()));
                }

            }, 10, TimeUnit.SECONDS);
        }
    }

}
