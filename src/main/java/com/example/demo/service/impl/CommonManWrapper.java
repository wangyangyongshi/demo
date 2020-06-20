package com.example.demo.service.impl;

import com.example.demo.service.Man;

/**
 * @author:wangyang
 * @creatDate:2019-12-07
 **/
public abstract class CommonManWrapper implements Man {

    private Man man;

    public CommonManWrapper(Man man) {
        this.man = man;
    }

    @Override
    public void action() {
        man.action();
    }
}
