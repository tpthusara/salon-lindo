package edu.bit.sms.scheduler.dao;

public class MethodResult {

    private String message;
    private int responsezcode;
    private boolean isOk;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getResponsezcode() {
        return responsezcode;
    }

    public void setResponsezcode(int responsezcode) {
        this.responsezcode = responsezcode;
    }

    public boolean isOk() {
        return isOk;
    }

    public void setOk(boolean ok) {
        isOk = ok;
    }
}
