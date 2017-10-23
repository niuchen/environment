package com.environment.mapper;

import com.environment.domain.TEquipmentData;
import com.environment.domain.TEquipmentDataExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TEquipmentDataMapper {
    int insert(TEquipmentData record);

    int insertSelective(TEquipmentData record);

    List<TEquipmentData> selectByExample(TEquipmentDataExample example);
    //查询设备,用最新的创建数分组设备
    List<TEquipmentData> selectEquipmentData(Map map);

    //分页查询历史数据
    List<TEquipmentData> selectSEquipmentData(Map map);

    int updateByExampleSelective(@Param("record") TEquipmentData record, @Param("example") TEquipmentDataExample example);

    int updateByExample(@Param("record") TEquipmentData record, @Param("example") TEquipmentDataExample example);
}