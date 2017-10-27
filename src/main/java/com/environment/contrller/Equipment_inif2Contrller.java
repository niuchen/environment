package com.environment.contrller;

 import com.environment.mypuls.entity.TEquipmentInfo2;
import com.environment.mypuls.service.ITEquipmentDataService;
import com.environment.mypuls.service.ITEquipmentInfo2Service;
 import com.environment.mypuls.service.ITWindDirectDicService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Equipment_info2")
@Api(value = "Equipmentinfo2Contrller", description = "设备数据" )
public class Equipment_inif2Contrller extends BaseTOAction{

    @Autowired
    ITEquipmentDataService TEquipmentDataServiceImpl;
    @Autowired
    ITWindDirectDicService TWindDirectDicServiceImpl;
    @Autowired
    ITEquipmentInfo2Service itEquipmentInfoService;

    @RequestMapping("Equipmentinfo2List.htm")
    @ResponseBody
    @ApiOperation(value = "返回设备数据")
    public Map EquipmentinfoList(String v_equipment_name){
        Map map=new HashMap();
        if(v_equipment_name!=null&&"".equals(v_equipment_name)){
            map.put("v_equipment_name",v_equipment_name);
        }
        List<TEquipmentInfo2> telsit=itEquipmentInfoService.getTEquipmentInfo(map);
          map.clear();
          map.put("list",telsit);
         map.put("msg","true");
        System.out.println(map);
         return map;
    }

}
