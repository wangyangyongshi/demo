package com.example.demo.service.impl;

import com.example.demo.service.Man;

/**
 * @author:wangyang
 * @creatDate:2019-12-07
 **/
public class CommonMan implements Man {

    @Override
    public void action() {
        System.out.println("我会跑步...");
    }
}
