package com.example.demo.design;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author:wangyang
 * @creatDate:2020-06-22
 **/
@Slf4j
@Component
public class InTransitOrderState implements OrderState{

    @Override
    public String orderService() {
        log.info(">>>切换为正在运送状态...");
        return "success";
    }
}
