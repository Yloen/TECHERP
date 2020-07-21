package com.tech.ssm.controller.SquadController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tech.ssm.domain.Squad;
import com.tech.ssm.service.SquadService;

@Controller
@RequestMapping("/Squad")
public class SquadController {
	
	@Autowired
	private SquadService squadservice;
	
	@RequestMapping("/list.do")
	@ResponseBody
	public List<Squad> squadlist(Squad squad){
		List<Squad> squadlist=squadservice.queryAll(squad);
		return squadlist;	
	}
	
	
	@RequestMapping("/select_by_id.do")
	@ResponseBody
	public Squad selectByPrimaryKey(String squad_id){
		Squad squad=squadservice.selectByPrimaryKey(squad_id);
		return squad;	
	}
	
	
	@RequestMapping(value="/delete_id.do")
	@ResponseBody
	private int Delete(String squad_id) {
		return squadservice.deleteByPrimaryKey(squad_id);
		
	}
	
	@RequestMapping(value="/insert.do")
	@ResponseBody
	private int Insert(Squad squad) {
		return squadservice.insert(squad);
		
	}
	
	@RequestMapping(value="/insertSelective.do")
	@ResponseBody
	private int InsertSelective(Squad squad) {
		return squadservice.insertSelective(squad);
		
	}
	
	@RequestMapping(value="/update_by_id_Selective.do")
	@ResponseBody
	private int updateByPrimaryKeySelective(Squad squad) {
		return squadservice.updateByPrimaryKeySelective(squad);
		
	}
	
	@RequestMapping(value="/update_by_id.do")
	@ResponseBody
	private int updateById(Squad squad) {
		return squadservice.updateByPrimaryKey(squad);
		
	}

}
