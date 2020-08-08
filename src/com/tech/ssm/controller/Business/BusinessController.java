package com.tech.ssm.controller.Business;

import javax.servlet.http.HttpSession;

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
	
	@RequestMapping(value="/teacher_add.do")
	public String Teacher_add(){
		return "teacher_add";
	}
	
	@RequestMapping(value="/teacher_show.do")
	public String Teacher_show(String teacher_id){
		return "redirect:/Teacher/select_by_id.do"+"?teacher_id="+teacher_id;
	}
	@RequestMapping(value="/teacher_edit.do")
	public String Teacher_edit(){
		return "teacher_edit";
	}
	
	
	
	@RequestMapping(value="/article_list.do")
	public String Article(){
		return "article_list";
	}
	@RequestMapping(value="/article_show.do")
	public String Article_show(){
		return "article_show";
	}
	
	@RequestMapping(value="/article_add.do")
	public String Article_Add(){
		return "article_add";
	}
	@RequestMapping(value="/article_edit.do")
	public String Article_edit(){
		return "article_edit";
	}
	
	
	
	@RequestMapping(value="/student_list.do")
	public String student_list(){
		return "student_list";
	}
	
	@RequestMapping(value="/student_show.do")
	public String student_show(){
		return "student_show";
	}
	
	
	@RequestMapping(value="/admin_list.do")
	public String admin_list(){
		return "admin_list";
	}
	
	@RequestMapping(value="/college_list.do")
	public String College(){
		return "college_list";
	}
	
	@RequestMapping(value="/change_password.do")
	public String Change_Password(String name,HttpSession session){
		session.setAttribute("name", name);
		return "change_password";
	}

	
	
}
