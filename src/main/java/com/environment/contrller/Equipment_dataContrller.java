package com.environment.contrller;

import au.com.bytecode.opencsv.CSVWriter;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.environment.mypuls.entity.TEquipmentData;
import com.environment.mypuls.entity.TEquipmentInfo2;
import com.environment.mypuls.entity.TWindDirectDic;
import com.environment.mypuls.mapper.TEquipmentDataMapper;
import com.environment.mypuls.service.ITEquipmentDataService;
import com.environment.mypuls.service.ITEquipmentInfo2Service;
import com.environment.mypuls.service.ITWindDirectDicService;
import com.environment.mypuls.service.impl.TWindDirectDicServiceImpl;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.Serializable;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Equipment_data")
@Api(value = "Equipment_dataContrller", description = "设备数据" )
public class Equipment_dataContrller extends BaseTOAction{

    @Autowired
    ITEquipmentDataService TEquipmentDataServiceImpl;
    @Autowired
    ITWindDirectDicService TWindDirectDicServiceImpl;
    @Autowired
    ITEquipmentInfo2Service itEquipmentInfoService;
    @Autowired
    TEquipmentDataMapper  TEquipmentDataMapper;



    @RequestMapping("Equipment_getID.htm")
    @ResponseBody
    @ApiOperation(value = "返回设备数据")
    public Map Equipment_getID(String vEquipmentName,Integer shu){
        Map map=new HashMap();
        if(vEquipmentName!=null&&!"".equals(vEquipmentName)){
            map.put("v_equipment_name",vEquipmentName);
        }else{
            map.put("msg","设备名称空");
            return map;
        }
        List<TEquipmentInfo2> telist= itEquipmentInfoService.getTEquipmentInfo(map);
        if(telist.size()<1){
            map.put("msg","不存在的设备名称");
            return map;
        }else{
            map.put("objdata",telist.get(0));
        }

      //  TEquipmentDataServiceImpl.selectPage(new com.baomidou.mybatisplus.plugins.Page<TEquipmentData>(0, 12));
       if(shu==null||shu==0){
           shu=1;
       }
        EntityWrapper<TEquipmentData> ew = new EntityWrapper<TEquipmentData>();
        ew.setEntity(new TEquipmentData());
        String name="vEquipmentName";
        ew.where("v_equipment_name = {0} ",vEquipmentName).
                orderBy("dtm_create",false).last("limit "+shu);
        List<TEquipmentData> objlist=   TEquipmentDataServiceImpl.selectList(ew);

        if(objlist.size()<0){
            map.put("msg","没有设备数据");
            return map;
        }
        List<TWindDirectDic> TWindDirectDicobj= TWindDirectDicServiceImpl.selectList(null);
        for (TEquipmentData tda:objlist){
            if(tda.getP005()!=null) {
                try{
                    tda.setP005name(TWindDirectDicobj.get(Integer.getInteger(tda.getP005().toString())).getvWindDirectName());
                }catch (Exception e){
                    tda.setP005name("无数据");
                }
            }else{
                tda.setP005name("无数据");
            }
        }
         map.put("objlist",objlist);
          map.put("msg","true");
         return map;
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
        PageHelper.clearPage();;
        params.clear();
        params.put("rows",te);
        params.put("total",page.getTotal());
        return params;
    }



    @RequestMapping("SEquipment_dateExport.htm")
    @ApiOperation(value = "设备历史数据 导出")
    public void SEquipment_dateExport(String date,HttpServletRequest request , HttpServletResponse response){
        CSVWriter csv=null;
        HttpSession session=request.getSession();
        try {
            //如果正在导出中 就终止,防止重复导出
            if(session.getAttribute("exportTag")!=null){
                response.setContentType("text/html;charset=UTF-8");
                response.getWriter().write("<script>alert('已经有一个文件下载正在进行中,未保证您的下载速度,请结束后在点击新的下载.')</script>");
                return;
            }
            Date date2 = new Date(System.currentTimeMillis());
            SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
            String times =  sdf.format(date2);
            session.setAttribute("exportTag",1);//开始导出
            String filename ="数据"+times+".csv";//设置下载时客户端Excel的名称
            response.reset();
            response.setCharacterEncoding("UTF-8");
            filename=new String(filename.getBytes("UTF-8"),"ISO-8859-1");
            response.setContentType("application/octet-stream;charset=GBK");
            response.setHeader("Content-Disposition", "attachment;Filename="+ filename);

         csv=   new CSVWriter(response.getWriter());
            String table[]=new String[]{
                    "设备编号", "传感器状态","PM2.5","PM10","风速","风向","温度","湿度","噪音","PM100"
                    ,"气压","风级","预留","预留","纬度","经度","数据插入时间"
            };

            csv.writeNext(table);
            csv.flush();
            String []datezu=date.split(" - ");
            Map params=new HashMap();
            params.put("start",datezu[0].replaceAll("/","-"));
            params.put("end",datezu[1].replaceAll("/","-"));
            List<TEquipmentData> te=    TEquipmentDataMapper.selectSEquipmentData(params);
            int i=0;
            for(TEquipmentData eq:te){
                request.getSession().setAttribute("exportTag",i++);
                String eqstr[]=new String[]{eq.getvEquipmentName(), eq.getP001().toString(), eq.getP002().toString(), eq.getP003().toString(), eq.getP004().toString(), eq.getP005name(), eq.getP006().toString(),
                        eq.getP007().toString(), eq.getP008().toString(), eq.getP009().toString(), eq.getP010().toString(), eq.getP011().toString(),
                        eq.getP012().toString(), eq.getP013().toString(), eq.getP014().toString(), eq.getP015().toString(),eq.getDtmCreate()
                };
                csv.writeNext(eqstr);
            }
            csv.flush();
            session.removeAttribute("exportTag");
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            session.removeAttribute("exportTag");
            if(csv!=null){
                try {
                    csv.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

//    public static void main(String []d){
//        System.out.println("2017/09/21".replaceAll("/","-"));
//    }
}
