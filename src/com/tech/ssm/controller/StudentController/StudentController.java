package com.tech.ssm.controller.StudentController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Student;
import com.tech.ssm.service.StudentService;

@Controller
@RequestMapping("/Student")
public class StudentController {
	
	@Autowired
	private StudentService studnetservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Student> studentlist(Student student){
		List<Student> studentlist=studnetservice.queryAll(student);
		return studentlist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Student selectByPrimaryKey(String student_id){
		Student student=studnetservice.selectByPrimaryKey(student_id);
		return student;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String student_id) {
		return studnetservice.deleteByPrimaryKey(student_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Student student) {
		return studnetservice.insert(student);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Student student) {
		return studnetservice.insertSelective(student);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Student student) {
		return studnetservice.updateByPrimaryKeySelective(student);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Student student) {
		return studnetservice.updateByPrimaryKey(student);
		
	}
	

}
