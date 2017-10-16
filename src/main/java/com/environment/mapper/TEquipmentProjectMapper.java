package com.environment.mapper;

import com.environment.domain.TEquipmentProject;
import com.environment.domain.TEquipmentProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TEquipmentProjectMapper {
    int insert(TEquipmentProject record);

    int insertSelective(TEquipmentProject record);

    List<TEquipmentProject> selectByExample(TEquipmentProjectExample example);

    int updateByExampleSelective(@Param("record") TEquipmentProject record, @Param("example") TEquipmentProjectExample example);

    int updateByExample(@Param("record") TEquipmentProject record, @Param("example") TEquipmentProjectExample example);
}