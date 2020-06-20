package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import sun.java2d.pipe.SpanIterator;

/**
 * @author:wangyang
 * @creatDate:2019-09-18
 **/
@ControllerAdvice
public class GlobalExceptionHandle {

    @ExceptionHandler(Exception.class)
    public void  serviceExceptionHandler(ArithmeticException ex) {

        System.out.println("====");
    }
}
