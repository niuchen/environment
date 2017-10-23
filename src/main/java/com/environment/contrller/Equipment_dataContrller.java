package com.environment.contrller;

import au.com.bytecode.opencsv.CSVWriter;
import com.environment.domain.TEquipmentData;
import com.environment.domain.TEquipmentDataExample;
import com.environment.mapper.TEquipmentDataMapper;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.catalina.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("Equipment_data")
@Api(value = "Equipment_dataContrller", description = "设备数据" )
public class Equipment_dataContrller extends BaseTOAction{

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
                String eqstr[]=new String[]{eq.getV_equipment_name(), eq.getP001().toString(), eq.getP002().toString(), eq.getP003().toString(), eq.getP004().toString(), eq.getP005(), eq.getP006().toString(),
                        eq.getP007().toString(), eq.getP008().toString(), eq.getP009().toString(), eq.getP010().toString(), eq.getP011().toString(),
                        eq.getP012().toString(), eq.getP013().toString(), eq.getP014().toString(), eq.getP015().toString(),eq.getDtm_create()
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
