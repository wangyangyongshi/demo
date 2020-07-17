package com.example.demo.CompletableFuture;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author:wangyang
 * @creatDate:2020-06-28
 **/
public class ThreadUPTest {


    public static void main(String[] args) {
        AtomicInteger atomicInteger = new AtomicInteger ();
        while (true) {
            UserInfo userInfo = new UserInfo ();
            System.out.println (userInfo);
        }
    }

}
