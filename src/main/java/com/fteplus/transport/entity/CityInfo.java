package com.fteplus.transport.entity;

public class CityInfo {
    private Integer id;

    private String mainCity;

    private String aroundCity;

    private Integer mileage;

    private String event;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMainCity() {
        return mainCity;
    }

    public void setMainCity(String mainCity) {
        this.mainCity = mainCity == null ? null : mainCity.trim();
    }

    public String getAroundCity() {
        return aroundCity;
    }

    public void setAroundCity(String aroundCity) {
        this.aroundCity = aroundCity == null ? null : aroundCity.trim();
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event == null ? null : event.trim();
    }
}