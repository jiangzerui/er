package com.sc.pojo;

public class Orgnaization {
    private Integer orgnaizationId;

    private String orgnaizationName;

    private String orgnaizationCode;

    private Integer orgnaizationType;

    public Integer getOrgnaizationId() {
        return orgnaizationId;
    }

    public void setOrgnaizationId(Integer orgnaizationId) {
        this.orgnaizationId = orgnaizationId;
    }

    public String getOrgnaizationName() {
        return orgnaizationName;
    }

    public void setOrgnaizationName(String orgnaizationName) {
        this.orgnaizationName = orgnaizationName == null ? null : orgnaizationName.trim();
    }

    public String getOrgnaizationCode() {
        return orgnaizationCode;
    }

    public void setOrgnaizationCode(String orgnaizationCode) {
        this.orgnaizationCode = orgnaizationCode == null ? null : orgnaizationCode.trim();
    }

    public Integer getOrgnaizationType() {
        return orgnaizationType;
    }

    public void setOrgnaizationType(Integer orgnaizationType) {
        this.orgnaizationType = orgnaizationType;
    }
}