package com.tech.ssm.domain;

/**
 * 资源表
 * 
 * @author Resources
 *
 */

public class Resources {
	private String resources_id;
	private String resources_name;
	private String resources_type;
	private String resources_details;

	public String getResources_id() {
		return resources_id;
	}

	public void setResources_id(String resources_id) {
		this.resources_id = resources_id;
	}

	public String getResources_name() {
		return resources_name;
	}

	public void setResources_name(String resources_name) {
		this.resources_name = resources_name;
	}

	public String getResources_type() {
		return resources_type;
	}

	public void setResources_type(String resources_type) {
		this.resources_type = resources_type;
	}

	public String getResources_details() {
		return resources_details;
	}

	public void setResources_details(String resources_details) {
		this.resources_details = resources_details;
	}

	@Override
	public String toString() {
		return "Resources [resources_id=" + resources_id + ", resources_name=" + resources_name + ", resources_type="
				+ resources_type + ", resources_details=" + resources_details + "]";
	}

}
