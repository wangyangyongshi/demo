package com.example.demo.common;

/**
 * @author:wangyang
 * @creatDate:2020-04-27
 **/
public interface BizHandle<RES> {

    //前置处理
    void preHandle();

    //具体逻辑
    void handle();

    //功能描述
    String desc();

    //异常处理
    void handleException(Throwable e, RES result);
}
