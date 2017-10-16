package com.environment.mapper;

import com.environment.domain.TUserEquipmentRelation;
import com.environment.domain.TUserEquipmentRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TUserEquipmentRelationMapper {
    int insert(TUserEquipmentRelation record);

    int insertSelective(TUserEquipmentRelation record);

    List<TUserEquipmentRelation> selectByExample(TUserEquipmentRelationExample example);

    int updateByExampleSelective(@Param("record") TUserEquipmentRelation record, @Param("example") TUserEquipmentRelationExample example);

    int updateByExample(@Param("record") TUserEquipmentRelation record, @Param("example") TUserEquipmentRelationExample example);
}