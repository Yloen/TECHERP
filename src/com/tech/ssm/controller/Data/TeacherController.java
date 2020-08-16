package com.tech.ssm.controller.Data;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Teacher;
import com.tech.ssm.service.TeacherService;

import sun.nio.cs.ext.MacHebrew;

@Controller
@RequestMapping("/Teacher")
public class TeacherController {
	
	@Autowired
	private TeacherService teacherservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Teacher> Teacherlist(Teacher teacher){
		List<Teacher> Teacherlist=teacherservice.queryAll(teacher);
		return Teacherlist;	
	}
	
	@RequestMapping("/listall.do")
	public String Teacher(Teacher teacher,HttpSession session){
		teacher=null;
		List<Teacher> teacherlist=teacherservice.queryAll(teacher);
		session.setAttribute("teacherlist", teacherlist);
		return "teacher_list";	
	}
	
	@RequestMapping("/select_by_id.do")
	public String selectByPrimaryKey(String teacher_id,HttpSession session){
		Teacher Teacher=teacherservice.selectByPrimaryKey(teacher_id);
		session.setAttribute("teacher", Teacher);
		return "teacher_show";	
	}
	
	
	@RequestMapping(value="/delete_id.do",method = RequestMethod.POST)
	@ResponseBody
	private int Delete(String teacher_id) {
		return teacherservice.deleteByPrimaryKey(teacher_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert( Teacher teacher) {
		String id=""+(int) (Math.random()*1000000);
		System.out.println(id);
		teacher.setTeacher_id(id);
		return teacherservice.insert(teacher);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Teacher teacher) {
		return teacherservice.insertSelective(teacher);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Teacher teacher) {
		return teacherservice.updateByPrimaryKeySelective(teacher);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Teacher teacher) {
		return teacherservice.updateByPrimaryKey(teacher);
		
	}
	
}
