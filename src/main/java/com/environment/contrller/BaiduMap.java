package com.environment.contrller;

import io.swagger.annotations.ApiOperation;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
@RequestMapping("/baidumap")
public class BaiduMap {
    @RequestMapping("/index.htm")
    @ApiOperation(value = "进入地图")
    public ModelAndView index(HttpServletRequest request , HttpServletResponse response){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("/baidumap/index");
        return mv;
    }
}
