package com.tech.ssm.controller.UserRight;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.tech.ssm.domain.Department;

import com.tech.ssm.service.DepartmentService;


@Controller
@RequestMapping("/Department")
public class DepartmentController {
	@Autowired
	private DepartmentService departmentService;

	// 部门列表
	@RequestMapping("/List.do")
	public String Departmentlist(HttpSession session) {
		List departmentlist = departmentService.find();
		session.setAttribute("departmentlist", departmentlist);
		return "Department/department_list";
	}

	// 添加新部门
	@RequestMapping("/Department_add")
	public String add() {
		return "Department/department_add";
	}
	
	@RequestMapping(value = "/Department_insert", method = RequestMethod.POST)
	@ResponseBody
	private int insert(Department department) {
		return departmentService.insert(department);
	}
	
	

	@RequestMapping("/Department_edit")
	public String edit(String DepartmentId, HttpSession session) {
		Department department = departmentService.selectByPrimaryKey(DepartmentId);
		session.setAttribute("department", department);
		return "Department/department_edit";
	}
	

	// 修改部门数据
	@RequestMapping(value = "/Department_update")
	@ResponseBody
	private int update(Department department) {
		System.out.println(department);
		return departmentService.updateByPrimaryKey(department);
	}

	// 部门信息展示
	@RequestMapping("/Department_show")
	public String searchDepartmentByDepartmentId(String DepartmentId, HttpSession session) {
		Department department = departmentService.selectByPrimaryKey(DepartmentId);
		session.setAttribute("department", department);
		return "Department/department_show";
	}

	// 模糊查询
	@RequestMapping("/findlikeDepartment")
	@ResponseBody
	public ModelAndView findlikeDepartment(Department department) {
		System.out.println(department);
		List<Department> departments = departmentService.likedepartment(department);
		ModelAndView data = new ModelAndView("Department/search_list");
		data.addObject("departments", departments);
		return data;
	}

	// 删除部门
	@RequestMapping("/Department_Delete")
	@ResponseBody
	public int Department(String DepartmentId) {
		return departmentService.deleteByPrimaryKey(DepartmentId);
	}

	// 批量删除部门
	@RequestMapping(value = "/Department_DeleteBatch")
	@ResponseBody
	private int deleteBatch(String[] ids) throws Exception {
		return departmentService.deleteBatch(ids);
	}
}
