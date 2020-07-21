package com.tech.ssm.controller.ResourcesController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Resources;
import com.tech.ssm.service.ResourcesService;

@Controller
@RequestMapping("/Resources")
public class ResourcesController {
	
	@Autowired
	private ResourcesService resourcesservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Resources> Resourceslist(Resources resources){
		List<Resources> resourceslist=resourcesservice.queryAll(resources);
		return resourceslist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Resources selectByPrimaryKey(String resources_id){
		Resources resources=resourcesservice.selectByPrimaryKey(resources_id);
		return resources;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String resources_id) {
		return resourcesservice.deleteByPrimaryKey(resources_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Resources resources) {
		return resourcesservice.insert(resources);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Resources resources) {
		return resourcesservice.insertSelective(resources);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Resources resources) {
		return resourcesservice.updateByPrimaryKeySelective(resources);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Resources resources) {
		return resourcesservice.updateByPrimaryKey(resources);
		
	}
	

}
