package com.tech.ssm.controller.UserRight;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tech.ssm.domain.Admin;

import com.tech.ssm.service.AdminService;

@Controller
@RequestMapping("/Admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@RequestMapping("/List.do")
	public String Adminlist(HttpSession session) {
		List adminlist = adminService.find();
		session.setAttribute("adminlist", adminlist);
		return "Admin/admin_list";
	}

	@RequestMapping("/Admin_add")
	public String add() {
		return "Admin/admin_add";
	}

	@RequestMapping("/Admin_NewPassword")
	public String update_new_password(Integer AdminId, HttpSession session) {
		Admin admin = adminService.selectByPrimaryKey(AdminId);
		session.setAttribute("pwd", admin);
		return "Admin/admin_new_password";
	}

	@RequestMapping("/Admin_UpdatePassword")
	public int update_password(String AdminPwd) {

		return adminService.updateNewPassword(AdminPwd);
	}

	@RequestMapping(value = "/Admin_insert", method = RequestMethod.POST)
	@ResponseBody
	private int insert(Admin admin) {
		System.out.println("******************");
		return adminService.insert(admin);
	}

	@RequestMapping("/Admin_edit")
	public String edit(Integer AdminId, HttpSession session) {
		Admin admin = adminService.selectByPrimaryKey(AdminId);
		session.setAttribute("admin", admin);
		return "Admin/admin_edit";
	}

	@RequestMapping(value = "/Admin_update")
	@ResponseBody
	private int update(Admin admin) {
		System.out.println(admin);
		System.out.println("*****************");
		return adminService.updateByPrimaryKey(admin);
	}

	@RequestMapping("/Admin_show")
	public String searchAdminByAdminId(Integer AdminId, HttpSession session) {
		Admin admin = adminService.selectByPrimaryKey(AdminId);
		session.setAttribute("admin", admin);
		return "Admin/admin_show";
	}

	@RequestMapping("/findlikeAdmin")
	@ResponseBody
	public ModelAndView findlikeAdmin(Admin admin) {
		System.out.println(admin);
		List<Admin> admins = adminService.likeadmin(admin);
		ModelAndView data = new ModelAndView("Admin/search_list");
		data.addObject("admins", admins);
		return data;
	}

	@RequestMapping("/Admin_Delete")
	@ResponseBody
	public int Admin(Integer AdminId) {
		return adminService.deleteByPrimaryKey(AdminId);
	}

	@RequestMapping(value = "/Admin_DeleteBatch")
	@ResponseBody
	private int deleteBatch(Integer[] ids) throws Exception {
		return adminService.deleteBatch(ids);
	}
}
