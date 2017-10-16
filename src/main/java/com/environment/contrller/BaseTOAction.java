package com.environment.contrller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Method;
import java.util.*;

/**
 * niuchen 201705 action的常用方法类 包括,服务器地址 权限dao
 * 
 ***/
@Scope("prototype")
public class BaseTOAction {
	ResponseData rsp=new ResponseData();


 	@RequestMapping("/exportTag")
	@ResponseBody
	public Map exportTag(HttpServletRequest request){
 		Map params=new HashMap();
 		params.put("exportTag",  request.getSession().getAttribute("exportTag"));
   		return params;
	}
 	
	@Autowired
	public HttpServletRequest request;
	private static final Logger logger = LoggerFactory.getLogger(BaseTOAction.class);




	// 返回服务器路径
	public String getBasepath() {
		String basepath = this.request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
				+ request.getContextPath() + "/";
		return basepath;
	}






	
	// public static void main(String []s){
	//
	//
	// InterviewShAction i=new InterviewShAction();
	// //i.index(null);
	// //获取类上的注解值
	// RequestMapping anno =
	// InterviewShAction.class.getAnnotation(RequestMapping.class);
	// if(anno != null){
	// Method[] met = anno.annotationType().getDeclaredMethods();
	// for(Method me : met ){
	// if(!me.isAccessible()){
	// me.setAccessible(true);
	// }
	// try {
	// System.out.println(me.getName());
	// System.out.println(me.invoke(anno, null));
	// if(me.getName().equals("value")){
	// String [] value= (String[]) me.invoke(anno, null);
	// System.out.println(value);
	// }
	// } catch (IllegalAccessException e) {
	// e.printStackTrace();
	// } catch (IllegalArgumentException e) {
	// e.printStackTrace();
	// } catch (InvocationTargetException e) {
	// e.printStackTrace();
	// }
	// }
	// }
	// }
}
