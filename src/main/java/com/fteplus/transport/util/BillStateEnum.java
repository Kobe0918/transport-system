package com.fteplus.transport.util;

public enum BillStateEnum {
    SUCCESS(1,"执行成功"), FAIL(0, "插入失败"),REWRITE_BEGIN_NUM(-1, "开始号码被占用"),REWRITE_END_NUM(-2, "重复插入"),  INNER_ERROR(-3, "系统异常");

    private Integer state;

    private String stateInfo;

    BillStateEnum() {
    }

    BillStateEnum(Integer state, String stateInfo) {
        this.state = state;
        this.stateInfo = stateInfo;
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


    public static BillStateEnum indexOf(Integer state){
        for(BillStateEnum bill : values()){
            if(bill.getState().equals(state)){
                return bill;
            }
        }
        return null;
    }

}
