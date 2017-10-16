package com.environment.contrller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.support.RequestContext;
import org.springframework.web.servlet.view.freemarker.FreeMarkerViewResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/baidumap")
@Api(value = "BaiduMap", description = "地图" )
public class BaiduMap extends BaseTOAction{
    @RequestMapping("/index.htm")
    @ApiOperation(value = "进入地图")
    public ModelAndView index(HttpServletRequest request , HttpServletResponse response){
     //org.springframework.web.servlet.support.RequestContext d= (RequestContext) request;
    // d.getContextPath()
        ModelAndView mv= new ModelAndView();
        mv.setViewName("/baidumap/baidumap");
        Map map=new HashMap();
        map.put("basepath",this.getBasepath());

        mv.addAllObjects(map);
        return mv;
    }
}
