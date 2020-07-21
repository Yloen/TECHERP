package com.tech.ssm.domain;

/**
 * 计划表
 * @author Plan
 *
 */

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;

public class Plan {

	private String plan_id;
	private String plan_person;
	private String plan_type;
	private String plan_name;
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_start;
	
	@JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
	private Date plan_end;
	private String plan_resource;

	public String getPlan_id() {
		return plan_id;
	}

	public void setPlan_id(String plan_id) {
		this.plan_id = plan_id;
	}

	public String getPlan_resource() {
		return plan_resource;
	}

	public void setPlan_resource(String plan_resource) {
		this.plan_resource = plan_resource;
	}

	public String getPaln_id() {
		return plan_id;
	}

	public void setPaln_id(String plan_id) {
		this.plan_id = plan_id;
	}

	public String getPlan_student() {
		return plan_person;
	}

	public void setPlan_student(String plan_person) {
		this.plan_person = plan_person;
	}

	public String getPlan_type() {
		return plan_type;
	}

	public void setPlan_type(String plan_type) {
		this.plan_type = plan_type;
	}

	public Date getPlan_start() {
		return plan_start;
	}

	public void setPlan_start(Date plan_start) {
		this.plan_start = plan_start;
	}

	public String getPlan_name() {
		return plan_name;
	}

	public void setPlan_name(String plan_name) {
		this.plan_name = plan_name;
	}

	public Date getPlan_end() {
		return plan_end;
	}

	public void setPlan_end(Date plan_end) {
		this.plan_end = plan_end;
	}

	@Override
	public String toString() {
		return "Plan [plan_id=" + plan_id + ", plan_person=" + plan_person + ", plan_type=" + plan_type
				+ ", plan_start=" + plan_start + ", plan_name=" + plan_name + ", plan_end=" + plan_end
				+ ", plan_resource=" + plan_resource + "]";
	}

}
