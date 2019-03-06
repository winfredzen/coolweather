package com.coolweather.android.gson;

/**
 * 接口更新时间
 */
public class Update {

    private String loc; //当地时间，24小时制，格式yyyy-MM-dd HH:mm

    private String utc; //UTC时间，24小时制，格式yyyy-MM-dd HH:mm

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getUtc() {
        return utc;
    }

    public void setUtc(String utc) {
        this.utc = utc;
    }
}
