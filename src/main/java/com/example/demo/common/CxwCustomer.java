package com.example.demo.common;

import com.google.common.base.Preconditions;

/**
 * @author:wangyang
 * @creatDate:2020-04-27
 **/
public class CxwCustomer {

    public static void main(String[] args) {
        CxwCustomer cxwCustomer = new CxwCustomer ();
        BaseRequest request = new BaseRequest ();
        request.setName ("wangyang");
        request.setRequestId ("12222");
        cxwCustomer.query (request);
    }

    public BaseResult query(BaseRequest request) {
        BaseResult result = new BaseResult ();
        CxwBizTemplate cxwBizTemplate = new CxwBizTemplate ();
        cxwBizTemplate.process (result, request, new BizHandle<BaseResult> () {
            @Override
            public void preHandle() {
                Preconditions.checkNotNull (request,
                        "request参数空");
                Preconditions.checkNotNull (request.getName (),
                        "request name参数空");
                Preconditions.checkNotNull (request.getRequestId (),
                        "request RequestId参数空");
            }

            @Override
            public void handle() {
                //TODO 你的业务代码
                try {
                    Thread.sleep (2000);
                } catch (InterruptedException e) {
                    e.printStackTrace ();
                }
            }

            @Override
            public String desc() {
                return "程序汪查询功能";
            }

            @Override
            public void handleException(Throwable e, BaseResult result) {
                result.setErrorDesc ("程序汪查询异常");
            }
        });
        return null;
    }
}
