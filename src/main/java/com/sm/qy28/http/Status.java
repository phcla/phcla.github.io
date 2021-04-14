package com.sm.qy28.http;

public enum Status {

    SUCCESS_OK("20000","成功"),
    ERROR_NO("40000","失败"),
    LOGIN_NO("40001","验证码不正确"),
    EMAIL_NO("40002","邮箱不存在"),

    ;


    private String status;
    private String massage;

    Status(String status, String massage) {
        this.status = status;
        this.massage = massage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMassage() {
        return massage;
    }

    public void setMassage(String massage) {
        this.massage = massage;
    }
}
