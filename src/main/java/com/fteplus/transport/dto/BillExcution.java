package com.fteplus.transport.dto;

import com.fteplus.transport.entity.Bill;
import com.fteplus.transport.util.BillStateEnum;

import java.util.List;

public class BillExcution {

    private long pageNo;
    private List<Bill> data;
    private Integer state;
    private String stateInfo;

    public BillExcution(Integer state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
    }

    public BillExcution(BillStateEnum billStateEnum){
        this.state = billStateEnum.getState();
        this.stateInfo = billStateEnum.getStateInfo();
    }

    public BillExcution(BillStateEnum stateEnum,long pageNo, List<Bill> data){
        this.pageNo = pageNo;
        this.data = data;
        this.state = stateEnum.getState();
        this.stateInfo = stateEnum.getStateInfo();
    }

    public BillExcution() {
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    @Override
    public String toString() {
        return "BillExcution{" +
                "state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                '}';
    }
}
