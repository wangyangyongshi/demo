package com.example.demo.common;

/**
 * @author:wangyang
 * @creatDate:2020-04-27
 **/
public class BaseResult {

    private String errorDesc;
    private String errorCode;

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }
}
