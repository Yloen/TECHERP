package com.tech.ssm.controller.Authority;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.tech.ssm.service.MenuService;

@Controller
@RequestMapping("Menu")
public class MenuController {
	
	@Autowired
	private MenuService menuService;

	@RequestMapping("/List.do")
	public String Adminlist(HttpSession session) {
		List menulist = menuService.find();
		session.setAttribute("menulist", menulist);
		return "Menu/menu_list";
	}

}
