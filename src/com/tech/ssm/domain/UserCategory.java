package com.tech.ssm.domain;

public class UserCategory {

	
	private Integer CategoryID;
	private String CategoryName;
	private Integer FId;
	public Integer getCategoryID() {
		return CategoryID;
	}
	public void setCategoryID(Integer categoryID) {
		CategoryID = categoryID;
	}
	public String getCategoryName() {
		return CategoryName;
	}
	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}
	public Integer getFId() {
		return FId;
	}
	public void setFId(Integer fId) {
		FId = fId;
	}
	
}
