package com.example.demo.CompletableFuture;

/**
 * @author:wangyang
 * @creatDate:2020-06-03
 **/
public class MyThread extends Thread {

    private SemaphoreService service;

    public MyThread(String name, SemaphoreService service) {
        super ();
        this.setName (name);
        this.service = service;
    }

    @Override
    public void run() {
        this.service.doSomething ();
    }
}
