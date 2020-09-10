package com.tech.ssm.domain;

public class Identity {
	private String IdentityId;
	private String IdentityName;
	private String status;
	public String getIdentityId() {
		return IdentityId;
	}
	public void setIdentityId(String identityId) {
		IdentityId = identityId;
	}
	public String getIdentityName() {
		return IdentityName;
	}
	public void setIdentityName(String identityName) {
		IdentityName = identityName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "Identity [IdentityId=" + IdentityId + ", IdentityName=" + IdentityName + ", status=" + status + "]";
	}
	
	
}
