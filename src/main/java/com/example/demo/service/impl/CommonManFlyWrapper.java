package com.example.demo.service.impl;

/**
 * @author:wangyang
 * @creatDate:2019-12-07
 **/

import com.example.demo.service.Man;

public class CommonManFlyWrapper extends CommonManWrapper {

    public CommonManFlyWrapper(Man man) {
        super(man);
    }

    @Override
    public void action() {
        super.action();
        fly();
    }

    private void fly() {
        System.out.println("我会飞...");
    }


    public static void main(String[] args) {
        new CommonManFlyWrapper(new CommonMan()).action();
    }
}
