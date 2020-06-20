package com.example.demo.common;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @author:wangyang
 * @creatDate:2020-04-27
 **/
public class CxwBizTemplate {

    public <RES extends BaseResult, REQ extends BaseRequest> RES process(RES result, REQ request, BizHandle bizHandle) {
        Stopwatch stopWatch = Stopwatch.createStarted ();
        try {
            bizHandle.preHandle ();
            bizHandle.handle ();
        } catch (Exception e) {
            bizHandle.handleException (e, result);
            e.printStackTrace ();
        } finally {
            //记录性能日志或统一处理 result
            System.out.println (bizHandle.desc () + " 耗时："
                    + stopWatch.elapsed (TimeUnit.SECONDS));
        }

        return null;
    }
}
