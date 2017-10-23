package com.environment.contrller;

import com.environment.domain.TEquipmentData;
import com.environment.domain.TEquipmentDataExample;
import com.environment.mapper.TEquipmentDataMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
           // 老的当时查询设备. 用java分组去重
//            TEquipmentDataExample de=new TEquipmentDataExample();
//            de.setOrderByClause("v_equipment_name desc");
//            TEquipmentDataExample.Criteria criteria =  de.createCriteria();//查询条件. 暂无就不设置了
//
//            de.setDistinct(true);//去重
//         List<TEquipmentData> list=TEquipmentDataMapper.selectByExample(de);
//            List<TEquipmentData> getlist=new ArrayList<TEquipmentData>();
//            for (int i=0;i<list.size();i++){
//                TEquipmentData listdata=list.get(i);
//                boolean isf=true;
//                for (TEquipmentData gitlistdata :getlist){
//                    if(listdata.getV_equipment_name().equals(gitlistdata.getV_equipment_name())){
//                        isf=false;
//                        break;
//                    }
//                }
//                if(isf) {
//                    getlist.add(listdata);
//                 }
//            }
            //新的查询设备 用分组查找最后创建时间的最大数据为基础
            List<TEquipmentData> list=TEquipmentDataMapper.selectEquipmentData(null);

            Map m=new HashMap();
            m.put("list",list);
            m.put("msg","true");
            return m;
        }


    @RequestMapping("SEquipment_dateList.htm")
    @ResponseBody
    @ApiOperation(value = "设备历史数据 分页")
    public Map SEquipment_dateList(int offset,int limit,String date,HttpServletRequest request , HttpServletResponse response){
        System.out.println(offset+" "+limit+"  "+date);
         Integer pageNum=(offset/limit)+1;
        Integer pageSize=limit;//每也显示的苏联
        String []datezu=date.split(" - ");
        Map params=new HashMap();
        params.put("start",datezu[0].replaceAll("/","-"));
        params.put("end",datezu[1].replaceAll("/","-"));
        Page<?> page =  PageHelper.startPage(pageNum,
                pageSize,true);
        List<TEquipmentData> te=    TEquipmentDataMapper.selectSEquipmentData(params);
        params.clear();
        params.put("rows",te);
        params.put("total",page.getTotal());
        return params;
    }

//    public static void main(String []d){
//        System.out.println("2017/09/21".replaceAll("/","-"));
//    }
}
