package com.example.demo.root;

import com.google.common.collect.Lists;
import org.json.JSONObject;
import org.junit.rules.Timeout;

import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * @author:wangyang
 * @creatDate:2020-03-11
 **/
public class Quene {


    public static void main(String[] args) {
        Task task = new Task ();
        Thread t1 = new Thread () {
            public void run() {
                task.methodA ();
            }
        };
        Thread t2 = new Thread () {
            public void run() {
                task.methodB ();
            }
        };

        t1.start ();
        t2.start ();
    }
}

class Task {
    private Object a = new Object ();
    private Object b = new Object ();

    public void run() {

    }

    public void methodA() {
        System.out.println ("开始执行A方法");
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        synchronized (a) {
            System.out.println ("对A方法上锁");
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println ("开始调用B方法");
            methodB ();
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        System.out.println ("A方法执行完毕");
    }

    public void methodB() {
        System.out.println ("开始执行B方法");
        try {
            Thread.sleep (2000);
        } catch (InterruptedException e) {
            e.printStackTrace ();
        }
        synchronized (b) {
            System.out.println ("对B方法上锁");
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
            System.out.println ("开始调用A方法");
            methodA ();
            try {
                Thread.sleep (2000);
            } catch (InterruptedException e) {
                e.printStackTrace ();
            }
        }
        System.out.println ("B方法执行完毕");
    }
}
