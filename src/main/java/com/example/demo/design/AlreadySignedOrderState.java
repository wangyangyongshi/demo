package com.example.demo.design;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @author:wangyang
 * @creatDate:2020-06-22
 **/
@Slf4j
@Component
public class AlreadySignedOrderState implements OrderState {
    @Override
    public Object orderService() {
        log.info(">> 切换已经签收状态");
        return "切换已经签收状态";
    }
}
