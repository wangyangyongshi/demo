package com.example.demo.root;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author:wangyang
 * @creatDate:2020-04-08
 **/

class Ticket implements Runnable {
    private int num = 100;
    private Lock lock = new ReentrantLock ();

    @Override
    public void run() {
        while (num > 0) {
            lock.lock ();
            try {
                lock.lockInterruptibly ();
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            try {
              System.out.println (lock.tryLock ());
                if (num > 0) {
                    num--;
                    System.out.println (Thread.currentThread ().getName () + "完成售票，余票为 " + num);
                    try {
                        Thread.sleep (1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace ();
                    }
                }
            } finally {
                lock.unlock ();
            }

        }

//        while (num > 0) {
////            lock.lock ();
//            synchronized (this) {
//                try {
//                    if (num > 0) {
//                        num--;
//                        System.out.println (Thread.currentThread ().getName () + "完成售票，余票为 " + num);
//                        try {
//                            Thread.sleep (1000);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace ();
//                        }
//                    }
////            } finally {
////                lock.unlock ();
////            }
//                } catch (Exception e) {
//                    e.printStackTrace ();
//                }
//            }
//        }

    }
}