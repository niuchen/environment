package com.environment.mypuls.entity;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import java.util.Date;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author niuchen
 * @since 2017-10-25
 */
@TableName("t_order_buffer")
public class TOrderBuffer extends Model<TOrderBuffer> {

    private static final long serialVersionUID = 1L;

    /**
     * 自增ID
     */
	@TableId(value="i_id", type= IdType.AUTO)
	private Long iId;
    /**
     * 设备名称
     */
	@TableField("v_equipment_name")
	private String vEquipmentName;
    /**
     * 发送内容
     */
	@TableField("v_order_content")
	private String vOrderContent;
    /**
     * 发送状态，0未发送，1已发送
     */
	@TableField("i_send_flag")
	private Integer iSendFlag;
    /**
     * 数据添加时间
     */
	@TableField("dtm_create")
	private Date dtmCreate;


	public Long getiId() {
		return iId;
	}

	public void setiId(Long iId) {
		this.iId = iId;
	}

	public String getvEquipmentName() {
		return vEquipmentName;
	}

	public void setvEquipmentName(String vEquipmentName) {
		this.vEquipmentName = vEquipmentName;
	}

	public String getvOrderContent() {
		return vOrderContent;
	}

	public void setvOrderContent(String vOrderContent) {
		this.vOrderContent = vOrderContent;
	}

	public Integer getiSendFlag() {
		return iSendFlag;
	}

	public void setiSendFlag(Integer iSendFlag) {
		this.iSendFlag = iSendFlag;
	}

	public Date getDtmCreate() {
		return dtmCreate;
	}

	public void setDtmCreate(Date dtmCreate) {
		this.dtmCreate = dtmCreate;
	}

	@Override
	protected Serializable pkVal() {
		return this.iId;
	}

	@Override
	public String toString() {
		return "TOrderBuffer{" +
			", iId=" + iId +
			", vEquipmentName=" + vEquipmentName +
			", vOrderContent=" + vOrderContent +
			", iSendFlag=" + iSendFlag +
			", dtmCreate=" + dtmCreate +
			"}";
	}
}
