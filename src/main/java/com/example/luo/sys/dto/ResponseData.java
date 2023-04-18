package com.example.luo.sys.dto;

import java.io.Serializable;

public class ResponseData<T> implements Serializable {

    private String code;

    private String msg;

    private Boolean success;

    private T data;


    public ResponseData(String code, String msg, Boolean success, T data) {
        this.code = code;
        this.msg = msg;
        this.success = success;
        this.data = data;
    }

    public ResponseData(String code, String msg, Boolean success) {
        this.code = code;
        this.msg = msg;
        this.success = success;
    }

    public ResponseData(ResultEnums resultEnums) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
        this.success = resultEnums.getSuccess();
    }

    public ResponseData(ResultEnums resultEnums, T data) {
        this.code = resultEnums.getCode();
        this.msg = resultEnums.getMsg();
        this.success = resultEnums.getSuccess();
        this.data = data;
    }

    public ResponseData() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}