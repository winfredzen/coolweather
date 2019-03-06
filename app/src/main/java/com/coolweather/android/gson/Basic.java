package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * 基础信息
 */
public class Basic {

    @SerializedName("location")
    private String cityName; //地区／城市名称

    @SerializedName("cid")
    private String weatherId; //地区／城市ID

    private String lat; //地区／城市纬度

    private String lon; //地区／城市经度

    private String parent_city; //该地区／城市的上级城市

    private String admin_area; //该地区／城市所属行政区域

    private String cnty; //该地区／城市所属国家名称

    private String tz; //该地区／城市所在时区

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getParent_city() {
        return parent_city;
    }

    public void setParent_city(String parent_city) {
        this.parent_city = parent_city;
    }

    public String getAdmin_area() {
        return admin_area;
    }

    public void setAdmin_area(String admin_area) {
        this.admin_area = admin_area;
    }

    public String getCnty() {
        return cnty;
    }

    public void setCnty(String cnty) {
        this.cnty = cnty;
    }

    public String getTz() {
        return tz;
    }

    public void setTz(String tz) {
        this.tz = tz;
    }
}
