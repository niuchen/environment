package com.environment.domain;

public class TWindDirectDic {
    private Integer i_wind_direct_id;

    private String v_wind_direct_name;

    public Integer getI_wind_direct_id() {
        return i_wind_direct_id;
    }

    public void setI_wind_direct_id(Integer i_wind_direct_id) {
        this.i_wind_direct_id = i_wind_direct_id;
    }

    public String getV_wind_direct_name() {
        return v_wind_direct_name;
    }

    public void setV_wind_direct_name(String v_wind_direct_name) {
        this.v_wind_direct_name = v_wind_direct_name == null ? null : v_wind_direct_name.trim();
    }
}