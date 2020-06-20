package com.example.demo;

import com.example.demo.service.RetryService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private RetryService retryService;

    @Test
    public void contextLoads() {

        int count = retryService.retry(-1);
        System.out.println("库存为 ：" + count);
    }

}
