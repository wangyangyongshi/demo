package com.example.demo.CompletableFuture;

import java.util.concurrent.TimeUnit;

/**
 * @author:wangyang
 * @creatDate:2020-04-11
 **/
public class QueryUtils {

        public String queryCar(Integer carId){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "car_desc";
        }
        public String queryJob(Integer jobId){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "job_desc";
        }
        public String queryHome(Integer homeId){
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "home_desc";
        }


//    public static void main(String[] args) {
////        QuerySuppiler querySuppiler  = QuerySuppiler::new;
//
//
//    }





}
