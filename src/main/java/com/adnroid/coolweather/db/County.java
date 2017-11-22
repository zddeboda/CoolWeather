package com.adnroid.coolweather.db;

import org.litepal.crud.DataSupport;

/*
 *  项目名：  TestDemo 
 *  包名：    com.adnroid.coolweather.db
 *  文件名:   County
 *  创建者:   zdd
 *  创建时间:  2017/11/22 14:59
 *  描述：    TODO
 */
public class County extends DataSupport{

    private int id;
    private String countyName;
    private String weatherId;//天气ID
    private int cityID;

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

    public int getCityID() {
        return cityID;
    }

    public void setCityID(int cityID) {
        this.cityID = cityID;
    }
}
