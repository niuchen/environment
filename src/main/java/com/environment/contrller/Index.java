package com.environment.contrller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@Scope("prototype")
@Api(value = "index", description = "进入" )
public class Index {




    @RequestMapping("/index.htm")
    @ApiOperation(value = "进入进入进入进入")
//    @ApiImplicitParams(value ={
//            @ApiImplicitParam(paramType="query",name="pageNum",dataType="Integer",required=true,value="页码"),
//            @ApiImplicitParam(paramType="query",name="pageSize",dataType="Integer",required=true,value="每页显示数量")
//    })
    public ModelAndView index(HttpServletRequest request , HttpServletResponse response){
        System.out.println("dddddd");
        ModelAndView mv= new ModelAndView();
         mv.setViewName("index");
        return mv;
    }


    @RequestMapping("/log.htm")
    @ApiOperation(value = "登陆")
//    @ApiImplicitParams(value ={
//            @ApiImplicitParam(paramType="query",name="pageNum",dataType="Integer",required=true,value="页码"),
//            @ApiImplicitParam(paramType="query",name="pageSize",dataType="Integer",required=true,value="每页显示数量")
//    })
    public ModelAndView log(String account,String password,HttpServletRequest request , HttpServletResponse response){
        System.out.println("dddddd");

        ModelAndView mv= new ModelAndView();
        mv.setViewName("main");
        return mv;
    }

}
