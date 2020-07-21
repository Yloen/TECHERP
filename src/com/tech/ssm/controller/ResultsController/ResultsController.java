package com.tech.ssm.controller.ResultsController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Results;
import com.tech.ssm.service.ResultsService;

@Controller
@RequestMapping("/Results")
public class ResultsController {
	
	@Autowired
	private ResultsService resultsservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Results> Resultslist(Results results){
		List<Results> resultslist=resultsservice.queryAll(results);
		return resultslist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Results selectByPrimaryKey(String results_id){
		Results results=resultsservice.selectByPrimaryKey(results_id);
		return results;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String results_id) {
		return resultsservice.deleteByPrimaryKey(results_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Results results) {
		return resultsservice.insert(results);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Results results) {
		return resultsservice.insertSelective(results);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Results results) {
		return resultsservice.updateByPrimaryKeySelective(results);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Results results) {
		return resultsservice.updateByPrimaryKey(results);
		
	}
	

}

