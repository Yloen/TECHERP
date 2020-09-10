package com.tech.ssm.domain;

public class Menu {
	private String MenuId;
	private String MenuName;
	private String MenuTag;
	private String MenuValue;
	private String MenuSrc;
	private String PicSrc;
	private Integer Status;
	private String Fid;
	private String Content;

	private Integer CategoryId;
	private String CategoryName;

	public String getMenuId() {
		return MenuId;
	}

	public void setMenuId(String menuId) {
		MenuId = menuId;
	}

	public String getMenuName() {
		return MenuName;
	}

	public void setMenuName(String menuName) {
		MenuName = menuName;
	}

	public String getMenuTag() {
		return MenuTag;
	}

	public void setMenuTag(String menuTag) {
		MenuTag = menuTag;
	}

	public String getMenuValue() {
		return MenuValue;
	}

	public void setMenuValue(String menuValue) {
		MenuValue = menuValue;
	}

	public String getMenuSrc() {
		return MenuSrc;
	}

	public void setMenuSrc(String menuSrc) {
		MenuSrc = menuSrc;
	}

	public String getPicSrc() {
		return PicSrc;
	}

	public void setPicSrc(String picSrc) {
		PicSrc = picSrc;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public String getFid() {
		return Fid;
	}

	public void setFid(String fid) {
		Fid = fid;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Integer getCategoryId() {
		return CategoryId;
	}

	public void setCategoryId(Integer categoryId) {
		CategoryId = categoryId;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	@Override
	public String toString() {
		return "Authority [MenuId=" + MenuId + ", MenuName=" + MenuName + ", MenuTag=" + MenuTag + ", MenuValue="
				+ MenuValue + ", MenuSrc=" + MenuSrc + ", PicSrc=" + PicSrc + ", Status=" + Status + ", Fid=" + Fid
				+ ", Content=" + Content + ", CategoryId=" + CategoryId + ", CategoryName=" + CategoryName + "]";
	}

}
