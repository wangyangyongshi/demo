package com.example.demo.root;

import com.example.demo.pojo.bo.Car;
import com.example.demo.pojo.dto.CarDTO;
import com.example.demo.service.Man;
import com.example.demo.service.impl.SuperMan;
import org.json.JSONObject;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author:wangyang
 * @creatDate:2019-11-25
 **/
public class BaseTest {


    public static void main(String[] args) {
        A baseTest = new A();

    }

    {
        System.out.println("==代码块");
    }

    static {
        System.out.println("===静态代码块");
    }

    public BaseTest() {
        System.out.println("===构造代码块");
    }


//    class A extends BaseTest{
//        {
//            System.out.println("==代码块");
//        }
//
//        static {
//            System.out.println("===静态代码块");
//        }
//
//        public A() {
//            System.out.println("===a构造代码块");
//        }
//    }

}
