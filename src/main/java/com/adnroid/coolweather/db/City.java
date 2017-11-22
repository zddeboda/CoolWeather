package com.adnroid.coolweather.db;

import org.litepal.crud.DataSupport;

/*
 *  项目名：  TestDemo 
 *  包名：    com.adnroid.coolweather.db
 *  文件名:   City
 *  创建者:   zdd
 *  创建时间:  2017/11/22 14:56
 *  描述：    TODO
 */
public class City extends DataSupport{

    private int id;
    private String cityName;
    private int cituCode;//城市代号
    private int provinceId;//省份ID值

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

    public int getCituCode() {
        return cituCode;
    }

    public void setCituCode(int cituCode) {
        this.cituCode = cituCode;
    }

    public int getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(int provinceId) {
        this.provinceId = provinceId;
    }
}
