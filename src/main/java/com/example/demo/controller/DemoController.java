package com.example.demo.controller;

import com.example.demo.pojo.dto.Sychronized;
import com.example.demo.pojo.dto.UserListDto;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author:wangyang
 * @creatDate:2019-09-18
 **/
@Controller
//@Scope("prototype")
public class DemoController {

     Sychronized sychronized =null;
   {
        sychronized = new Sychronized ();
    }
    @Autowired
    private DemoService demoService;

    private String name;

    @RequestMapping(value = "/{username}",method = RequestMethod.GET)
    public void userProfile(@PathVariable("username") String username) {
        name = username;
        try {
            for(int i = 0; i < 100; i++) {
                System.out.println(Thread.currentThread().getId() + "name:" + name);
                Thread.sleep(2000);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return;
    }

    @RequestMapping(value = "/aaa",method = RequestMethod.POST)
    public String testGetParam(@RequestParam("userListDtos") String userListDtos) {

        System.out.println(userListDtos);

        return "aaa";
    }




    @GetMapping("/bbb/{vvv}")
    public String testSychronized(@PathVariable("vvv") String vvv) {
        Sychronized  aa = new Sychronized ();
        System.out.println (aa);
//        System.out.println (sychronized);
        aa.test ();
//        aa.test1 ();
        return "aaa";
    }


    @GetMapping("/bbb/aaa/{ggg}")
    public String testSychronized1(@PathVariable("ggg") String ggg) {
        Sychronized  aa = new Sychronized ();
        System.out.println (aa);
        aa.test1 ();
//        aa.test1 ();
        return "aaa";
    }
}
