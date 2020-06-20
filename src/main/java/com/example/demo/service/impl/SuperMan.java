package com.example.demo.service.impl;

/**
 * @author:wangyang
 * @creatDate:2019-12-07
 **/
public class SuperMan extends CommonMan {

    @Override
    public void action() {
        super.action();
        fly();

    }

    public void fly() {
        System.out.println("我会飞。。。。");
    }
}
