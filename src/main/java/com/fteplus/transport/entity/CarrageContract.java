package com.fteplus.transport.entity;

import java.util.Date;

public class CarrageContract {
    private Integer id;

    private Integer contractNum;

    private String beginPlace;

    private String endPlace;

    private String licence;

    private Date startTime;

    private String functionary;

    private String functionaryPhone;

    private Integer cashDeposit;

    private Integer serviceCharge;

    private String payWay;

    private Integer cashPledge;

    private String countWay;

    private Integer freight;

    private Integer insurance;

    private Integer prypay;

    private Date signTime;

    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getContractNum() {
        return contractNum;
    }

    public void setContractNum(Integer contractNum) {
        this.contractNum = contractNum;
    }

    public String getBeginPlace() {
        return beginPlace;
    }

    public void setBeginPlace(String beginPlace) {
        this.beginPlace = beginPlace == null ? null : beginPlace.trim();
    }

    public String getEndPlace() {
        return endPlace;
    }

    public void setEndPlace(String endPlace) {
        this.endPlace = endPlace == null ? null : endPlace.trim();
    }

    public String getLicence() {
        return licence;
    }

    public void setLicence(String licence) {
        this.licence = licence == null ? null : licence.trim();
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public String getFunctionary() {
        return functionary;
    }

    public void setFunctionary(String functionary) {
        this.functionary = functionary == null ? null : functionary.trim();
    }

    public String getFunctionaryPhone() {
        return functionaryPhone;
    }

    public void setFunctionaryPhone(String functionaryPhone) {
        this.functionaryPhone = functionaryPhone == null ? null : functionaryPhone.trim();
    }

    public Integer getCashDeposit() {
        return cashDeposit;
    }

    public void setCashDeposit(Integer cashDeposit) {
        this.cashDeposit = cashDeposit;
    }

    public Integer getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(Integer serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    public String getPayWay() {
        return payWay;
    }

    public void setPayWay(String payWay) {
        this.payWay = payWay == null ? null : payWay.trim();
    }

    public Integer getCashPledge() {
        return cashPledge;
    }

    public void setCashPledge(Integer cashPledge) {
        this.cashPledge = cashPledge;
    }

    public String getCountWay() {
        return countWay;
    }

    public void setCountWay(String countWay) {
        this.countWay = countWay == null ? null : countWay.trim();
    }

    public Integer getFreight() {
        return freight;
    }

    public void setFreight(Integer freight) {
        this.freight = freight;
    }

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
    }

    public Integer getPrypay() {
        return prypay;
    }

    public void setPrypay(Integer prypay) {
        this.prypay = prypay;
    }

    public Date getSignTime() {
        return signTime;
    }

    public void setSignTime(Date signTime) {
        this.signTime = signTime;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}