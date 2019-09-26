package com.fteplus.transport.dto;

public class BillInfoDto<T> {
    private boolean flag ;
    private String message ;
    private T  data;

    public BillInfoDto() {
    }

    public BillInfoDto(boolean flag, String message) {
        this.flag = flag;
        this.message = message;
    }

    public BillInfoDto(boolean flag, String message, T data) {
        this.flag = flag;
        this.message = message;
        this.data = data;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BillInfoDto{" +
                "flag=" + flag +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
