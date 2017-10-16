package com.environment.domain;

import java.util.Date;

public class TEquipmentInfo {
    private Integer i_equipment_id;

    private String v_equipment_name;

    private String v_equipment_type;

    private Integer i_euiqpment_type_id;

    private String v_equipment_check_code;

    private Date dtm_create;

    private String v_company;

    private String v_phone;

    private String v_address;

    public Integer getI_equipment_id() {
        return i_equipment_id;
    }

    public void setI_equipment_id(Integer i_equipment_id) {
        this.i_equipment_id = i_equipment_id;
    }

    public String getV_equipment_name() {
        return v_equipment_name;
    }

    public void setV_equipment_name(String v_equipment_name) {
        this.v_equipment_name = v_equipment_name == null ? null : v_equipment_name.trim();
    }

    public String getV_equipment_type() {
        return v_equipment_type;
    }

    public void setV_equipment_type(String v_equipment_type) {
        this.v_equipment_type = v_equipment_type == null ? null : v_equipment_type.trim();
    }

    public Integer getI_euiqpment_type_id() {
        return i_euiqpment_type_id;
    }

    public void setI_euiqpment_type_id(Integer i_euiqpment_type_id) {
        this.i_euiqpment_type_id = i_euiqpment_type_id;
    }

    public String getV_equipment_check_code() {
        return v_equipment_check_code;
    }

    public void setV_equipment_check_code(String v_equipment_check_code) {
        this.v_equipment_check_code = v_equipment_check_code == null ? null : v_equipment_check_code.trim();
    }

    public Date getDtm_create() {
        return dtm_create;
    }

    public void setDtm_create(Date dtm_create) {
        this.dtm_create = dtm_create;
    }

    public String getV_company() {
        return v_company;
    }

    public void setV_company(String v_company) {
        this.v_company = v_company == null ? null : v_company.trim();
    }

    public String getV_phone() {
        return v_phone;
    }

    public void setV_phone(String v_phone) {
        this.v_phone = v_phone == null ? null : v_phone.trim();
    }

    public String getV_address() {
        return v_address;
    }

    public void setV_address(String v_address) {
        this.v_address = v_address == null ? null : v_address.trim();
    }
}