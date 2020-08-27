package com.tech.ssm.domain;

public class Content {
	private String ContentId;
	private String Topic;
	private String PublicDate;
	private String Content;
	private Integer Status;
	private String Author;
	private String FileSrc;
	private String PicSrc;

	private Integer FId;
	private Integer CategoryId;
	private String CategoryName;

	public String getContentId() {
		return ContentId;
	}

	public void setContentId(String contentId) {
		ContentId = contentId;
	}

	public String getTopic() {
		return Topic;
	}

	public void setTopic(String topic) {
		Topic = topic;
	}

	public String getPublicDate() {
		return PublicDate;
	}

	public void setPublicDate(String publicDate) {
		PublicDate = publicDate;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		Content = content;
	}

	public Integer getStatus() {
		return Status;
	}

	public void setStatus(Integer status) {
		Status = status;
	}

	public String getAuthor() {
		return Author;
	}

	public void setAuthor(String author) {
		Author = author;
	}

	public String getFileSrc() {
		return FileSrc;
	}

	public void setFileSrc(String fileSrc) {
		FileSrc = fileSrc;
	}

	public String getPicSrc() {
		return PicSrc;
	}

	public void setPicSrc(String picSrc) {
		PicSrc = picSrc;
	}

	public Integer getFId() {
		return FId;
	}

	public void setFId(Integer fId) {
		FId = fId;
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
		return "Content [ContentId=" + ContentId + ", Topic=" + Topic + ", PublicDate=" + PublicDate + ", Content="
				+ Content + ", Status=" + Status + ", Author=" + Author + ", FileSrc=" + FileSrc + ", PicSrc=" + PicSrc
				+ ", FId=" + FId + ", CategoryId=" + CategoryId + ", CategoryName=" + CategoryName + "]";
	}

}
