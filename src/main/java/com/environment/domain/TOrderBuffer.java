package com.environment.domain;

import java.util.Date;

public class TOrderBuffer {
    private Long i_id;

    private String v_equipment_name;

    private String v_order_content;

    private Integer i_send_flag;

    private Date dtm_create;

    public Long getI_id() {
        return i_id;
    }

    public void setI_id(Long i_id) {
        this.i_id = i_id;
    }

    public String getV_equipment_name() {
        return v_equipment_name;
    }

    public void setV_equipment_name(String v_equipment_name) {
        this.v_equipment_name = v_equipment_name == null ? null : v_equipment_name.trim();
    }

    public String getV_order_content() {
        return v_order_content;
    }

    public void setV_order_content(String v_order_content) {
        this.v_order_content = v_order_content == null ? null : v_order_content.trim();
    }

    public Integer getI_send_flag() {
        return i_send_flag;
    }

    public void setI_send_flag(Integer i_send_flag) {
        this.i_send_flag = i_send_flag;
    }

    public Date getDtm_create() {
        return dtm_create;
    }

    public void setDtm_create(Date dtm_create) {
        this.dtm_create = dtm_create;
    }
}