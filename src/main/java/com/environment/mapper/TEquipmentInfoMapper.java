package com.environment.mapper;

import com.environment.domain.TEquipmentInfo;
import com.environment.domain.TEquipmentInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEquipmentInfoMapper {
    int deleteByPrimaryKey(Integer i_equipment_id);

    int insert(TEquipmentInfo record);

    int insertSelective(TEquipmentInfo record);

    List<TEquipmentInfo> selectByExample(TEquipmentInfoExample example);

    TEquipmentInfo selectByPrimaryKey(Integer i_equipment_id);

    int updateByExampleSelective(@Param("record") TEquipmentInfo record, @Param("example") TEquipmentInfoExample example);

    int updateByExample(@Param("record") TEquipmentInfo record, @Param("example") TEquipmentInfoExample example);

    int updateByPrimaryKeySelective(TEquipmentInfo record);

    int updateByPrimaryKey(TEquipmentInfo record);
}