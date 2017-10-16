package com.environment.domain;

import java.util.Date;

public class TEquipmentProject {
    private String v_equipment_name;

    private String v_project_name;

    private String v_url;

    private String v_system;

    private Date dtm_add;

    private Integer i_system_id;

    public String getV_equipment_name() {
        return v_equipment_name;
    }

    public void setV_equipment_name(String v_equipment_name) {
        this.v_equipment_name = v_equipment_name == null ? null : v_equipment_name.trim();
    }

    public String getV_project_name() {
        return v_project_name;
    }

    public void setV_project_name(String v_project_name) {
        this.v_project_name = v_project_name == null ? null : v_project_name.trim();
    }

    public String getV_url() {
        return v_url;
    }

    public void setV_url(String v_url) {
        this.v_url = v_url == null ? null : v_url.trim();
    }

    public String getV_system() {
        return v_system;
    }

    public void setV_system(String v_system) {
        this.v_system = v_system == null ? null : v_system.trim();
    }

    public Date getDtm_add() {
        return dtm_add;
    }

    public void setDtm_add(Date dtm_add) {
        this.dtm_add = dtm_add;
    }

    public Integer getI_system_id() {
        return i_system_id;
    }

    public void setI_system_id(Integer i_system_id) {
        this.i_system_id = i_system_id;
    }
}