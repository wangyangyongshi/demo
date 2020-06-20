package com.example.demo.root;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author:wangyang
 * @creatDate:2020-04-09
 **/
public class MyThread05 extends Thread {

    public void test3() throws Exception{
        final Lock lock=new ReentrantLock ();
        lock.lock();
        Thread.sleep(1000);
        Thread t1=new Thread(new Runnable(){
            @Override
            public void run() {
//                lock.lock();
	        	try {
					lock.lockInterruptibly();
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                System.out.println(Thread.currentThread().getName()+" interrupted.");
            }
        });

        t1.start();

//        lock.unlock ();
        t1.interrupt();
//        Thread.sleep(1000);

//        Thread.sleep(1000);
    }


    public static void main(String[] args) {
        MyThread05 myThread05 = new MyThread05 ();
        try {
            myThread05.test3 ();
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }
}
