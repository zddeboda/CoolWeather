package com.adnroid.coolweather.db;

import org.litepal.crud.DataSupport;

/*
 *  项目名：  TestDemo 
 *  包名：    com.adnroid.coolweather.db
 *  文件名:   Province
 *  创建者:   zdd
 *  创建时间:  2017/11/22 14:55
 *  描述：    TODO
 */
public class Province extends DataSupport{

    private int id;
    private String provinceName;
    private int provinceCode;//省份代号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }


}
