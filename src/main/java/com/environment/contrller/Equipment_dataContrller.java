package com.environment.contrller;

import com.environment.domain.TEquipmentData;
import com.environment.domain.TEquipmentDataExample;
import com.environment.mapper.TEquipmentDataMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Equipment_data")
@Api(value = "Equipment_dataContrller", description = "设备数据" )
public class Equipment_dataContrller {

    @Autowired
    private TEquipmentDataMapper TEquipmentDataMapper;

        @RequestMapping("Equipment_dateList.htm")
        @ResponseBody
        @ApiOperation(value = "返回设备数据")
        public Map Equipment_dateList(){
            TEquipmentDataExample de=new TEquipmentDataExample();
            de.setOrderByClause("v_equipment_name desc");
            TEquipmentDataExample.Criteria criteria =  de.createCriteria();//查询条件. 暂无就不设置了

            de.setDistinct(true);//去重
            List<TEquipmentData> list=TEquipmentDataMapper.selectByExample(de);
            List<TEquipmentData> getlist=new ArrayList<TEquipmentData>();
            for (int i=0;i<list.size();i++){
                TEquipmentData listdata=list.get(i);
                boolean isf=true;
                for (TEquipmentData gitlistdata :getlist){
                    if(listdata.getV_equipment_name().equals(gitlistdata.getV_equipment_name())){
                        isf=false;
                        break;
                    }
                }
                if(isf) {
                    getlist.add(listdata);
                 }
            }
            Map m=new HashMap();
            m.put("list",getlist);
            m.put("msg","true");
            return m;
        }

}
