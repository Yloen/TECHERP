package com.tech.ssm.domain;

public class User {

	private String UserId;
	private String UserName;
	private String UserPwd;
	private Integer CategoryId;
	private Integer Status;
	private String CategoryName;
	
	

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getUserPwd() {
		return UserPwd;
	}

	public void setUserPwd(String userPwd) {
		UserPwd = userPwd;
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
		return "User [UserId=" + UserId + ", UserName=" + UserName + ", UserPwd=" + UserPwd + ", CategoryId="
				+ CategoryId + ", Status=" + Status + ", CategoryName=" + CategoryName + "]";
	}

	

}
