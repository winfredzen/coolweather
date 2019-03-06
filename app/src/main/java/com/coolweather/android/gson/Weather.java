package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * 天气实体类
 */
public class Weather {

    private String status; //接口状态

    private Basic basic;

    private Update update;

    private Now now;

    @SerializedName("lifestyle")
    private List<Lifestyle> lifestyleList;

    @SerializedName("daily_forecast")
    private List<Forecast> forecastList;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Basic getBasic() {
        return basic;
    }

    public void setBasic(Basic basic) {
        this.basic = basic;
    }

    public Update getUpdate() {
        return update;
    }

    public void setUpdate(Update update) {
        this.update = update;
    }

    public Now getNow() {
        return now;
    }

    public void setNow(Now now) {
        this.now = now;
    }

    public List<Lifestyle> getLifestyleList() {
        return lifestyleList;
    }

    public void setLifestyleList(List<Lifestyle> lifestyleList) {
        this.lifestyleList = lifestyleList;
    }

    public List<Forecast> getForecastList() {
        return forecastList;
    }

    public void setForecastList(List<Forecast> forecastList) {
        this.forecastList = forecastList;
    }
}
