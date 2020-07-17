package com.example.demo.common;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;

/**
 * @author:wangyang
 * @creatDate:2020-04-27
 **/
public class BaseResult extends AbstractQueuedSynchronizer {

//    private String errorDesc;
//    private String errorCode;
//
//    public String getErrorDesc() {
//        return errorDesc;
//    }
//
//    public void setErrorDesc(String errorDesc) {
//        this.errorDesc = errorDesc;
//    }
//
//    public String getErrorCode() {
//        return errorCode;
//    }
//
//    public void setErrorCode(String errorCode) {
//        this.errorCode = errorCode;
//    }
//
//    public static void main(String[] args) {
//        Set set = new HashSet ();
//        set.add (1);
//        set.add (2);
//        set.add (3);
//        set.add (4);
//        set.add (4);
//        set.add (5);
//        set.add (6);
//        set.add (7);
//        System.out.println (set);
//
//    }


    @Override
    protected boolean tryAcquire(int unused) {
        //使用compareAndSetState控制AQS中的同步变量
        if (compareAndSetState (0, 1)) {
            setExclusiveOwnerThread (Thread.currentThread ());
            return true;
        }
        return false;
    }


    @Override
    protected boolean tryRelease(int unused) {
        setExclusiveOwnerThread (null);
        //使用setState控制AQS中的同步变量
        setState (0);
        return true;
    }

    public void lock() {
        acquire (1);
    }

    public boolean tryLock() {
        return tryAcquire (1);
    }

    public void unlock() {
        release (1);
    }

    /**
     * 发现线程是顺序获得锁的
     * 因为AQS是基于CLH锁的一个变种实现的FIFO调度
     */
    public static void main(String[] args) throws InterruptedException {
        final BaseResult lock = new BaseResult ();
        lock.lock ();
        for (int i = 0; i < 10; i++) {
            new Thread (new Runnable () {
                @Override
                public void run() {
                    lock.lock ();
                    System.out.println (Thread.currentThread ().getId () + " acquired the lock!");
                    lock.unlock ();
                }
            }).start ();
            // 简单的让线程按照for循环的顺序阻塞在lock上
            //目的是让线程顺序启动
            Thread.sleep (100);
        }

        System.out.println ("main thread unlock!");
        lock.unlock ();


        ExecutorService executorService = Executors.newCachedThreadPool ();

    }
}
