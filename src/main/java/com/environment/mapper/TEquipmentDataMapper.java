package com.environment.mapper;

import com.environment.domain.TEquipmentData;
import com.environment.domain.TEquipmentDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEquipmentDataMapper {
    int insert(TEquipmentData record);

    int insertSelective(TEquipmentData record);

    List<TEquipmentData> selectByExample(TEquipmentDataExample example);

    int updateByExampleSelective(@Param("record") TEquipmentData record, @Param("example") TEquipmentDataExample example);

    int updateByExample(@Param("record") TEquipmentData record, @Param("example") TEquipmentDataExample example);
}