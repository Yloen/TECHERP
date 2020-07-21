package com.tech.ssm.controller.TeacherController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Teacher;
import com.tech.ssm.service.TeacherService;

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
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Teacher selectByPrimaryKey(String teacher_id){
		Teacher Teacher=teacherservice.selectByPrimaryKey(teacher_id);
		return Teacher;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String teacher_id) {
		return teacherservice.deleteByPrimaryKey(teacher_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Teacher teacher) {
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
