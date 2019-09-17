package com.fteplus.transport.entity;

import java.util.Date;

public class Bill {
    private Integer id;

    private Integer beginNum;

    private Integer endNum;

    private String receiver;

    private String receiverPhone;

    private String distributePerson;

    private String distributePersionPhone;

    private String receivePlace;

    private Date receiveTime;

    private String type;

    private Date writeTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBeginNum() {
        return beginNum;
    }

    public void setBeginNum(Integer beginNum) {
        this.beginNum = beginNum;
    }

    public Integer getEndNum() {
        return endNum;
    }

    public void setEndNum(Integer endNum) {
        this.endNum = endNum;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver == null ? null : receiver.trim();
    }

    public String getReceiverPhone() {
        return receiverPhone;
    }

    public void setReceiverPhone(String receiverPhone) {
        this.receiverPhone = receiverPhone == null ? null : receiverPhone.trim();
    }

    public String getDistributePerson() {
        return distributePerson;
    }

    public void setDistributePerson(String distributePerson) {
        this.distributePerson = distributePerson == null ? null : distributePerson.trim();
    }

    public String getDistributePersionPhone() {
        return distributePersionPhone;
    }

    public void setDistributePersionPhone(String distributePersionPhone) {
        this.distributePersionPhone = distributePersionPhone == null ? null : distributePersionPhone.trim();
    }

    public String getReceivePlace() {
        return receivePlace;
    }

    public void setReceivePlace(String receivePlace) {
        this.receivePlace = receivePlace == null ? null : receivePlace.trim();
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public Date getWriteTime() {
        return writeTime;
    }

    public void setWriteTime(Date writeTime) {
        this.writeTime = writeTime;
    }
}