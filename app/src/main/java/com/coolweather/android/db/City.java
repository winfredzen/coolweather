package com.coolweather.android.db;

import org.litepal.crud.DataSupport;

/**
 * 市模型
 */
public class City extends DataSupport {

    private int id;

    //城市名称
    private String cityName;

    //城市代号
    private int cityCode;

    //所属省的id
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getCityCode() {
        return cityCode;
    }

    public void setCityCode(int cityCode) {
        this.cityCode = cityCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
