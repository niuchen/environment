package com.environment.mypuls.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.environment.mypuls.entity.TEquipmentData;
import com.environment.mypuls.entity.TEquipmentData2;

import java.util.List;
import java.util.Map;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author niuchen
 * @since 2017-10-25
 */
public interface TEquipmentData2Mapper extends BaseMapper<TEquipmentData2> {
    //  int insert(TEquipmentData record);

    int insertSelective(TEquipmentData2 record);

   // List<TEquipmentData> selectByExample(TEquipmentDataExample example);
    //查询设备,用最新的创建数分组设备
    List<TEquipmentData2> selectEquipmentData(Map map);

    //分页查询历史数据
    List<TEquipmentData2> selectSEquipmentData(Map map);

//    int updateByExampleSelective(@Param("record") TEquipmentData record, @Param("example") TEquipmentDataExample example);
//
//    int updateByExample(@Param("record") TEquipmentData record, @Param("example") TEquipmentDataExample example);
}