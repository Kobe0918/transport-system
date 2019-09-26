package com.fteplus.transport.entity;

import java.util.Date;

public class DetailBill {
    private Integer id;

    private String type;

    private Integer billNum;

    private String status = "已填";

    private Date writeTime = new Date();

    public DetailBill() {
    }

    public DetailBill(String type, Integer billNum) {
        this.type = type;
        this.billNum = billNum;

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Integer getBillNum() {
        return billNum;
    }

    public void setBillNum(Integer billNum) {
        this.billNum = billNum;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }
}