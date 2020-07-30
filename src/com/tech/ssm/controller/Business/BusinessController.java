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
	
	
	@RequestMapping(value="/article_list.do")
	public String Article(){
		return "article_list";
	}
	
	@RequestMapping(value="/college_list.do")
	public String College(){
		return "college_list";
	}
	
	@RequestMapping(value="/change_password.do")
	public String Change_Password(){
		return "change_password";
	}

	
	@RequestMapping(value="/article_add.do")
	public String Article_Add(){
		return "article_add";
	}
}
