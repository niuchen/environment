//package com.environment.contrller;
//
//import au.com.bytecode.opencsv.CSVWriter;
//import com.baomidou.mybatisplus.mapper.EntityWrapper;
//import com.environment.mypuls.entity.TEquipmentData;
//import com.environment.mypuls.entity.TEquipmentInfo;
//import com.environment.mypuls.entity.TWindDirectDic;
//import com.environment.mypuls.mapper.TEquipmentDataMapper;
//import com.environment.mypuls.service.ITEquipmentDataService;
//import com.environment.mypuls.service.ITEquipmentInfoService;
//import com.environment.mypuls.service.ITWindDirectDicService;
//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageHelper;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.ResponseBody;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.sql.Date;
//import java.text.SimpleDateFormat;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Controller
//@RequestMapping("Equipment_info")
//@Api(value = "EquipmentinfoContrller", description = "设备数据" )
//public class Equipment_inifContrller extends BaseTOAction{
//
//    @Autowired
//    ITEquipmentDataService TEquipmentDataServiceImpl;
//    @Autowired
//    ITWindDirectDicService TWindDirectDicServiceImpl;
//    @Autowired
//    ITEquipmentInfoService itEquipmentInfoService;
//
//
//
//    @RequestMapping("EquipmentinfoList.htm")
//    @ResponseBody
//    @ApiOperation(value = "返回设备数据")
//    public Map EquipmentinfoList(String vEquipmentName){
//        Map map=new HashMap();
//        List<TEquipmentInfo> telsit=itEquipmentInfoService.getTEquipmentInfo(map);
//
//         map.clear();
//         map.put("telsit",telsit);
//         map.put("msg","true");
//         return map;
//    }
//
//}
