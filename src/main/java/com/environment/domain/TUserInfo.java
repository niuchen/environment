package com.environment.domain;

import java.util.Date;

public class TUserInfo {
    private Integer i_user_id;

    private String v_user_name;

    private String v_password;

    private Date dtm_create;

    private Integer i_admin;

    public Integer getI_user_id() {
        return i_user_id;
    }

    public void setI_user_id(Integer i_user_id) {
        this.i_user_id = i_user_id;
    }

    public String getV_user_name() {
        return v_user_name;
    }

    public void setV_user_name(String v_user_name) {
        this.v_user_name = v_user_name == null ? null : v_user_name.trim();
    }

    public String getV_password() {
        return v_password;
    }

    public void setV_password(String v_password) {
        this.v_password = v_password == null ? null : v_password.trim();
    }

    public Date getDtm_create() {
        return dtm_create;
    }

    public void setDtm_create(Date dtm_create) {
        this.dtm_create = dtm_create;
    }

    public Integer getI_admin() {
        return i_admin;
    }

    public void setI_admin(Integer i_admin) {
        this.i_admin = i_admin;
    }
}