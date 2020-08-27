package com.tech.ssm.domain;

public class Admin {
	private Integer AdminId;
	private String AdminName;
	private String AdminPwd;
	private Integer CategoryId;
	private Integer Status;
	private String CategoryName;
	
	
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public Integer getAdminId() {
		return AdminId;
	}
	public void setAdminId(Integer adminId) {
		AdminId = adminId;
	}
	public String getAdminName() {
		return AdminName;
	}
	public void setAdminName(String adminName) {
		AdminName = adminName;
	}
	public String getAdminPwd() {
		return AdminPwd;
	}
	public void setAdminPwd(String adminPwd) {
		AdminPwd = adminPwd;
	}
	public Integer getCategoryId() {
		return CategoryId;
	}
	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}
	public Integer getStatus() {
		return Status;
	}
	public void setStatus(Integer status) {
		Status = status;
	}
	@Override
	public String toString() {
		return "Admin [AdminId=" + AdminId + ", AdminName=" + AdminName + ", AdminPwd=" + AdminPwd + ", CategoryId="
				+ CategoryId + ", Status=" + Status + ", CategoryName=" + CategoryName + "]";
	}
	
	

}
