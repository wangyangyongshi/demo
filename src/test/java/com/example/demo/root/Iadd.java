package com.example.demo.root;

import java.util.LinkedHashMap;

/**
 * @author:wangyang
 * @creatDate:2020-03-15
 **/
public class Iadd {


    public static void main(String[] args) {

        Thread thread = new Thread (new Runnable () {

            @Override
            public void run() {
                System.out.println (Thread.currentThread ().getName () +"+1+");
                try {
                    Thread.sleep (10000000);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }

            }
        });

        LinkedHashMap a  = new LinkedHashMap ();
        a.get ("d");
        a.put ("a",a);


        for (int i = 0; i < 100; i++) {
            System.out.println (Thread.currentThread ().getName () + "  " + i);
            if (i == 30) {
                thread.start ();
                try {
                    thread.join ();
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }
        }


    }
}
