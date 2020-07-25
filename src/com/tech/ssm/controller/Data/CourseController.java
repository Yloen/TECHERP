package com.tech.ssm.controller.Data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Course;
import com.tech.ssm.service.CourseService;

@Controller
@RequestMapping("/Course")
public class CourseController {
	
	@Autowired
	private CourseService courseservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Course> courselist(Course course){
		List<Course> courselist=courseservice.queryAll(course);
		return courselist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Course selectByPrimaryKey(String course_id){
		Course course=courseservice.selectByPrimaryKey(course_id);
		return course;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String course_id) {
		return courseservice.deleteByPrimaryKey(course_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Course course) {
		return courseservice.insert(course);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Course course) {
		return courseservice.insertSelective(course);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Course course) {
		return courseservice.updateByPrimaryKeySelective(course);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Course course) {
		return courseservice.updateByPrimaryKey(course);
		
	}
	

}