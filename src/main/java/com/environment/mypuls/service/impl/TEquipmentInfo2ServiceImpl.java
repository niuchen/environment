package com.environment.mypuls.service.impl;

 import com.environment.mypuls.entity.TEquipmentInfo2;
import com.environment.mypuls.mapper.TEquipmentInfo2Mapper;
import com.environment.mypuls.service.ITEquipmentInfo2Service;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author niuchen
 * @since 2017-10-27
 */
@Service
public class TEquipmentInfo2ServiceImpl extends ServiceImpl<TEquipmentInfo2Mapper, TEquipmentInfo2> implements ITEquipmentInfo2Service {
    @Override
    public List<TEquipmentInfo2> getTEquipmentInfo(Map map) {
        return baseMapper.getTEquipmentInfo(map);
    }
}
