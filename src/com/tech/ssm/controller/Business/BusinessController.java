package com.tech.ssm.controller.Business;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 页面跳转
 * @author ASUS
 *
 */
@Controller
public class BusinessController {
	
	  //跳转登录
    @RequestMapping(value={"/","/first","/login"})
	public String first(){
		return "index";
		}
	
	@RequestMapping(value="/index.do")
	public String index(){
		return "index";	
	}
	
	@RequestMapping(value="/welcome.do")
	public String welcome(){
		return "welcome";	
	}
	
	
	@RequestMapping(value="/teacher.do")
	public String Teacher(){
		return "redirect:/Teacher/listall.do";
	}

}
