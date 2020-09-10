package com.tech.ssm.domain;

public class UserIdentity {
	private String UserId;
	private String IdentityId;
	private String IdentityName;

	public String getUserId() {
		return UserId;
	}

	public void setUserId(String userId) {
		UserId = userId;
	}

	public String getIdentityId() {
		return IdentityId;
	}

	public void setIdentityId(String identityId) {
		IdentityId = identityId;
	}

	@Override
	public String toString() {
		return "UserIdentity [UserId=" + UserId + ", IdentityId=" + IdentityId + "]";
	}

	public String getIdentityName() {
		return IdentityName;
	}

	public void setIdentityName(String identityName) {
		IdentityName = identityName;
	}

}
