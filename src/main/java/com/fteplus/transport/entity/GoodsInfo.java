package com.fteplus.transport.entity;

public class GoodsInfo {
    private Integer id;

    private Integer waybillNum;

    private String goodsName;

    private Integer goodsNum;

    private Integer number;

    private Integer weight;

    private Integer volume;

    private Integer goodsValue;

    private Integer insurance;

    private String countWay;

    private Integer freight;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getWaybillNum() {
        return waybillNum;
    }

    public void setWaybillNum(Integer waybillNum) {
        this.waybillNum = waybillNum;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName == null ? null : goodsName.trim();
    }

    public Integer getGoodsNum() {
        return goodsNum;
    }

    public void setGoodsNum(Integer goodsNum) {
        this.goodsNum = goodsNum;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Integer getVolume() {
        return volume;
    }

    public void setVolume(Integer volume) {
        this.volume = volume;
    }

    public Integer getGoodsValue() {
        return goodsValue;
    }

    public void setGoodsValue(Integer goodsValue) {
        this.goodsValue = goodsValue;
    }

    public Integer getInsurance() {
        return insurance;
    }

    public void setInsurance(Integer insurance) {
        this.insurance = insurance;
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
}