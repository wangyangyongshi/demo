package com.example.demo.root;

/**
 * @author:wangyang
 * @creatDate:2020-02-24
 **/
public class A extends BaseTest{
    {
        System.out.println("==A代码块");
    }

    static {
        System.out.println("===A静态代码块");
    }

    public A() {
        System.out.println("===A构造代码块");
    }
}