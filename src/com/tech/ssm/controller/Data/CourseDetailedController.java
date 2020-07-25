package com.tech.ssm.controller.Data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.CourseDetailed;
import com.tech.ssm.service.CourseDetailedService;

@Controller
@RequestMapping("/CourseDetailed")
public class CourseDetailedController {
	
	@Autowired
	private CourseDetailedService coursedetailedservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<CourseDetailed> coursedetailedlist(CourseDetailed coursedetailed){
		List<CourseDetailed> coursedetailedlist=coursedetailedservice.queryAll(coursedetailed);
		return coursedetailedlist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public CourseDetailed selectByPrimaryKey(String coursedetailed_id){
		CourseDetailed coursedetailed=coursedetailedservice.selectByPrimaryKey(coursedetailed_id);
		return coursedetailed;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String coursedetailed_id) {
		return coursedetailedservice.deleteByPrimaryKey(coursedetailed_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(CourseDetailed coursedetailed) {
		return coursedetailedservice.insert(coursedetailed);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(CourseDetailed coursedetailed) {
		return coursedetailedservice.insertSelective(coursedetailed);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(CourseDetailed coursedetailed) {
		return coursedetailedservice.updateByPrimaryKeySelective(coursedetailed);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(CourseDetailed coursedetailed) {
		return coursedetailedservice.updateByPrimaryKey(coursedetailed);
		
	}
	

}

