package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 县模型
 */
public class County extends DataSupport {

    private int id;

    private String countyName;

    //县对应的天气id
    private String weatherId;

    //县所属市的id
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }
}
