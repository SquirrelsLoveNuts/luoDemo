package com.example.luo.sys.dto;

public enum ResultEnums {

    SUCCESS("0000", "请求成功", true),
    ERROR("1111", "请求失败", false),
    SYSTEM_ERROR("1000", "系统异常", false),
    BUSSINESS_ERROR("2001", "业务逻辑错误", false),
    VERIFY_CODE_ERROR("2002", "业务参数错误", false),
    PARAM_ERROR("2002", "业务参数错误", false);

    private String code;
    private String msg;
    private Boolean success;

    ResultEnums(String code, String msg, Boolean success) {
        this.code = code;
        this.msg = msg;
        this.success = success;
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
}
