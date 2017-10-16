package com.environment.contrller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@Scope("prototype")
@Api(value = "index", description = "系统入口" )
public class Index {




    @RequestMapping("/index.htm")
    @ApiOperation(value = "进入")
    public ModelAndView index(HttpServletRequest request , HttpServletResponse response){
        ModelAndView mv= new ModelAndView();
         mv.setViewName("index");
        return mv;
    }


    @RequestMapping("/login.htm")
    @ApiOperation(value = "登陆")
    @ApiImplicitParams(value ={
            @ApiImplicitParam(paramType="query",name="account",dataType="String",required=true,value="账号"),
            @ApiImplicitParam(paramType="query",name="password",dataType="String",required=true,value="密码")
    })
    @ResponseBody
    public Map login(String account, String password, HttpServletRequest request , HttpServletResponse response){

        Map map=new HashMap();
        if(account.equals("1")&&password.equals("1")){
            map.put("msg","ok");
        }else{
            map.put("msg","error");
        }

        return map;
    }
    @RequestMapping("/main.htm")
    @ApiOperation(value = "进入工作页")
    public ModelAndView main(){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("main");
        return mv;
    }

    @RequestMapping("/quit.htm")
    @ApiOperation(value = "退出返回主页")
    public ModelAndView quit(){
        ModelAndView mv= new ModelAndView();
        mv.setViewName("index");
        return mv;
    }
}
