package com.tech.ssm.domain;

public class Permissions {
	
	private String permissions_id;
	private String permissions_identity;
	private String permissions_ability;
	public String getPermissions_id() {
		return permissions_id;
	}
	public void setPermissions_id(String permissions_id) {
		this.permissions_id = permissions_id;
	}
	public String getPermissions_identity() {
		return permissions_identity;
	}
	public void setPermissions_identity(String permissions_identity) {
		this.permissions_identity = permissions_identity;
	}
	public String getPermissions_ability() {
		return permissions_ability;
	}
	public void setPermissions_ability(String permissions_ability) {
		this.permissions_ability = permissions_ability;
	}
	@Override
	public String toString() {
		return "Permissions [permissions_id=" + permissions_id + ", permissions_identity=" + permissions_identity
				+ ", permissions_ability=" + permissions_ability + "]";
	}
	
	

}
