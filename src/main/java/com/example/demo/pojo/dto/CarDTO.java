package com.example.demo.pojo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import sun.rmi.rmic.iiop.StaticStringsHash;

/**
 * @author:wangyang
 * @creatDate:2019-11-25
 **/
@Data
//@AllArgsConstructor
public class CarDTO {

    private static Integer cost;

    static {
        cost = 1;
        System.out.println("静态代码块===");
    }

    private Double price;
    private String name;

    {
        System.out.println("Instance Block A.");
    }

    public CarDTO() {
        System.out.println("无参数构造方法");
    }

    public CarDTO(Double price, String name) {
        this.price = price;
        this.name = name;
        System.out.println("有参数构造方法");
    }


    public static void main(String[] args) {
        for(int i = 0;i<10;i++){
            get();
            System.out.println(222);
        }
    }

    public static String get(){
        return "2";
    }

}
