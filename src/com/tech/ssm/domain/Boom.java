package com.tech.ssm.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Boom {
	private String boom_id;
	private String organize;
	private String quesetion;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date starttime;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date deadline;
	
	private String boom_owner;
	private String state;
	public String getBoom_id() {
		return boom_id;
	}
	public void setBoom_id(String boom_id) {
		this.boom_id = boom_id;
	}
	public String getOrganize() {
		return organize;
	}
	public void setOrganize(String organize) {
		this.organize = organize;
	}
	public String getQuesetion() {
		return quesetion;
	}
	public void setQuesetion(String quesetion) {
		this.quesetion = quesetion;
	}
	public Date getStarttime() {
		return starttime;
	}
	public void setStarttime(Date starttime) {
		this.starttime = starttime;
	}
	public Date getDeadline() {
		return deadline;
	}
	public void setDeadline(Date deadline) {
		this.deadline = deadline;
	}
	public String getBoom_owner() {
		return boom_owner;
	}
	public void setBoom_owner(String boom_owner) {
		this.boom_owner = boom_owner;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Boom [boom_id=" + boom_id + ", organize=" + organize + ", quesetion=" + quesetion + ", starttime="
				+ starttime + ", deadline=" + deadline + ", boom_owner=" + boom_owner + ", state=" + state + "]";
	}
	
	

}
