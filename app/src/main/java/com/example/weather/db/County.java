package com.example.weather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String conutyName;
    private int countyCode;
    private int cityId;

    public void setId(int id) {
        this.id = id;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setConutyName(String conutyName) {
        this.conutyName = conutyName;
    }

    public void setCountyCode(int countyCode) {
        this.countyCode = countyCode;
    }

    public int getId() {
        return id;
    }

    public int getCityId() {
        return cityId;
    }

    public int getCountyCode() {
        return countyCode;
    }

    public String getConutyName() {
        return conutyName;
    }
}
