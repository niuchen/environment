package com.environment.domain;

import java.util.Date;

public class TUserEquipmentRelation {
    private Integer i_user_id;

    private Integer i_equipment_id;

    private Date dtm_create;

    public Integer getI_user_id() {
        return i_user_id;
    }

    public void setI_user_id(Integer i_user_id) {
        this.i_user_id = i_user_id;
    }

    public Integer getI_equipment_id() {
        return i_equipment_id;
    }

    public void setI_equipment_id(Integer i_equipment_id) {
        this.i_equipment_id = i_equipment_id;
    }

    public Date getDtm_create() {
        return dtm_create;
    }

    public void setDtm_create(Date dtm_create) {
        this.dtm_create = dtm_create;
    }
}