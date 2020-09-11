package com.tech.ssm.controller.Authority;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tech.ssm.domain.Menu;
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

	// 详细界面
	@RequestMapping("/Menu_show")
	public String searchMenuByMenuId(String MenuId, HttpSession session) {
		Menu menu = menuService.selectByID(MenuId);
		session.setAttribute("menu", menu);
		return "Menu/menu_show";
	}
	

	// 伪删除
	@RequestMapping("/Menu_Recovery")
	@ResponseBody
	public int recovery(String MenuId) {
		return menuService.Recovery(MenuId);
	}

	// 伪删除 (多)
	@RequestMapping("/Menu_RecoveryBatch")
	@ResponseBody
	public int recoverybatch(String[] MenuId) {
		return menuService.RecoveryBatch(MenuId);
	}

	// 回收站界面
	@RequestMapping("/Menu_RecoveryList")
	public String Recoverylist(HttpSession session) {
		List menulist = menuService.findRecovery();
		session.setAttribute("menulist", menulist);
		return "Menu/recovery_list";

	}

	// 撤销
	@RequestMapping("/Revocation")
	@ResponseBody
	public int Revocation(String MenuId) {
		return menuService.Revocation(MenuId);
	}

	// 删除
	@RequestMapping("/Menu_Delete")
	@ResponseBody
	public int delete(String MenuId) {
		return menuService.deleteByID(MenuId);
	}

	// 批量删除
	@RequestMapping(value = "/Menu_DeleteBatch")
	@ResponseBody
	private int deleteBatch(String[] ids) throws Exception {
		return menuService.deleteBatch(ids);
	}

	// 模糊查询
	@RequestMapping("/findlikeMenu")
	@ResponseBody
	public ModelAndView findlikeMenu(Menu Menu) {
		List<Menu> Menus = menuService.likecontent(Menu);
		ModelAndView data = new ModelAndView("Menu/search_list");
		data.addObject("Menus", Menus);
		return data;
	}


}
