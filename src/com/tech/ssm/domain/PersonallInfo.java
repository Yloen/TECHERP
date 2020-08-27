package com.tech.ssm.domain;

public class PersonallInfo{
	private String UserId;
	private String PersonalId;
	private String DepartmentId;
	private String Name;
	private String Sex;
	private String Photo;
	private String Content;
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		UserId = userId;
	}
	public String getPersonalId() {
		return PersonalId;
	}
	public void setPersonalId(String personalId) {
		PersonalId = personalId;
	}
	public String getDepartmentId() {
		return DepartmentId;
	}
	public void setDepartmentId(String departmentId) {
		DepartmentId = departmentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSex() {
		return Sex;
	}
	public void setSex(String sex) {
		Sex = sex;
	}
	public String getPhoto() {
		return Photo;
	}
	public void setPhoto(String photo) {
		Photo = photo;
	}
	public String getContent() {
		return Content;
	}
	public void setContent(String content) {
		Content = content;
	}
	@Override
	public String toString() {
		return "PersonallInfo [UserId=" + UserId + ", PersonalId=" + PersonalId + ", DepartmentId=" + DepartmentId
				+ ", Name=" + Name + ", Sex=" + Sex + ", Photo=" + Photo + ", Content=" + Content + "]";
	}
}