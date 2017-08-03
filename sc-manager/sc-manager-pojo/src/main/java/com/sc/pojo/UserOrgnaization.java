package com.sc.pojo;

public class UserOrgnaization {
    private Integer userOrgnaizationId;

    private String orgnaizationName;

    private Integer verifyPassed;

    private Integer userId;

    private Integer orgnaizationId;

    public Integer getUserOrgnaizationId() {
        return userOrgnaizationId;
    }

    public void setUserOrgnaizationId(Integer userOrgnaizationId) {
        this.userOrgnaizationId = userOrgnaizationId;
    }

    public String getOrgnaizationName() {
        return orgnaizationName;
    }

    public void setOrgnaizationName(String orgnaizationName) {
        this.orgnaizationName = orgnaizationName == null ? null : orgnaizationName.trim();
    }

    public Integer getVerifyPassed() {
        return verifyPassed;
    }

    public void setVerifyPassed(Integer verifyPassed) {
        this.verifyPassed = verifyPassed;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrgnaizationId() {
        return orgnaizationId;
    }

    public void setOrgnaizationId(Integer orgnaizationId) {
        this.orgnaizationId = orgnaizationId;
    }
}