package com.tech.ssm.controller.CollegeController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.College;
import com.tech.ssm.service.CollegeService;

@Controller
@RequestMapping("/College")
public class CollegeController {
	
	@Autowired
	private CollegeService collegeservice;
	
	@RequestMapping("/list")
	@ResponseBody
	public List<College> collegelist(College college){
		List<College> collegelist=collegeservice.queryAll(college);
		return collegelist;	
	}
	
	
	@RequestMapping("/select_by_id")
	@ResponseBody
	public College selectByPrimaryKey(String college_id){
		College college=collegeservice.selectByPrimaryKey(college_id);
		return college;	
	}
	
	
	@RequestMapping(value="/delete_id")
	@ResponseBody
	private int Delete(String college_id) {
		return collegeservice.deleteByPrimaryKey(college_id);
		
	}
	
	@RequestMapping(value="/insert")
	@ResponseBody
	private int Insert(College college) {
		return collegeservice.insert(college);
		
	}
	
	@RequestMapping(value="/insertSelective")
	@ResponseBody
	private int InsertSelective(College college) {
		return collegeservice.insertSelective(college);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective")
	@ResponseBody
	private int updateByPrimaryKeySelective(College college) {
		return collegeservice.updateByPrimaryKeySelective(college);
		
	}
	
	@RequestMapping(value="/update_by_id")
	@ResponseBody
	private int updateById(College college) {
		return collegeservice.updateByPrimaryKey(college);
		
	}
	

}
