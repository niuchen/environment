package com.environment.mapper;


import java.util.List;

import com.environment.domain.TEquipmentData170831;
import com.environment.domain.TEquipmentData170831Example;
import org.apache.ibatis.annotations.Param;

public interface TEquipmentData170831Mapper {
    int insert(TEquipmentData170831 record);

    int insertSelective(TEquipmentData170831 record);

    List<TEquipmentData170831> selectByExample(TEquipmentData170831Example example);

    int updateByExampleSelective(@Param("record") TEquipmentData170831 record, @Param("example") TEquipmentData170831Example example);

    int updateByExample(@Param("record") TEquipmentData170831 record, @Param("example") TEquipmentData170831Example example);
}