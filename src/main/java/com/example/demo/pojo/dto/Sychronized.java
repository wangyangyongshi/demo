package com.example.demo.pojo.dto;

/**
 * @author:wangyang
 * @creatDate:2020-03-01
 **/
public class Sychronized {


    public void test() {

        System.out.println (Thread.currentThread ().getName ());
        synchronized (this) {
            long timeStart = System.currentTimeMillis ();
            System.out.println ("------开始");
            try {
                Thread.sleep (6000000);
                System.out.println ("------结束");
                long timeEnd = System.currentTimeMillis ();
                System.out.println ("----用了时间：" + (timeEnd - timeStart));
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
    }

    public void test1() {
        System.out.println (Thread.currentThread ().getName ());
        synchronized (this){
            long timeStart = System.currentTimeMillis ();
            System.out.println ("=======开始");
            try {
                Thread.sleep(6000000);
                long timeEnd = System.currentTimeMillis ();
                System.out.println ("======用了时间："+ (timeEnd-timeStart));
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }


    }









}
